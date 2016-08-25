package onlyfun.caterpillar;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

public class OtherIntroduction 
              implements IntroductionInterceptor, IOther {   
    // �O�_��@��IOther����
    public boolean implementsInterface(Class clazz) {
        return clazz.isAssignableFrom(IOther.class);
    }
    
    public Object invoke(MethodInvocation methodInvocation) 
                                      throws Throwable {
        // �p�G�I�s����k�Ӧ�IOther�������w�q
        if(implementsInterface(
            methodInvocation.getMethod().getDeclaringClass())) {
            // �I�s�����B�~�[�J�]mixin�^���欰
            return methodInvocation.getMethod().
                    invoke(this, methodInvocation.getArguments());
        }
        else {
            return methodInvocation.proceed();
        }
    }
    
    public void doOther() {
        System.out.println("�W�[��¾�d�C�C�C");
    }
}