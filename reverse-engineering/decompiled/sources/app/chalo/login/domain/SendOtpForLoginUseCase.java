package app.chalo.login.domain;

import app.chalo.behaviour.policy.ResolveProfilePolicyUseCase;
import app.chalo.login.data.repository.LoginRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/SendOtpForLoginUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendOtpForLoginUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5249a;
    public final ResolveProfilePolicyUseCase b;

    public SendOtpForLoginUseCase(LoginRepository loginRepository, ResolveProfilePolicyUseCase resolveProfilePolicyUseCase) {
        this.f5249a = loginRepository;
        this.b = resolveProfilePolicyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r12 == r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.domain.SendOtpForLoginUseCase.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
