package app.chalo.login.domain;

import app.chalo.Device;
import app.chalo.login.data.repository.LoginRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/VerifyLoginSuccessOnServerAndHandleTokensUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyLoginSuccessOnServerAndHandleTokensUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5254a;
    public final ParseAndStoreTokensUseCase b;
    public final Device c;

    public VerifyLoginSuccessOnServerAndHandleTokensUseCase(LoginRepository loginRepository, ParseAndStoreTokensUseCase parseAndStoreTokensUseCase, Device device) {
        this.f5254a = loginRepository;
        this.b = parseAndStoreTokensUseCase;
        this.c = device;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if (r3.o(r10, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.login.data.models.app.LoginModeAppModel r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.domain.VerifyLoginSuccessOnServerAndHandleTokensUseCase.a(app.chalo.login.data.models.app.LoginModeAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
