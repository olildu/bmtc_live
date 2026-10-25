package app.chalo.login.domain;

import app.chalo.Device;
import app.chalo.login.data.repository.LoginRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/RefreshAuthTokensForUserUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefreshAuthTokensForUserUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5245a;
    public final ParseAndStoreTokensUseCase b;
    public final Device c;

    public RefreshAuthTokensForUserUseCase(LoginRepository loginRepository, ParseAndStoreTokensUseCase parseAndStoreTokensUseCase, Device device) {
        this.f5245a = loginRepository;
        this.b = parseAndStoreTokensUseCase;
        this.c = device;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006f A[Catch: ChaloLocalException -> 0x003e, NetworkSuccessResponseParseException -> 0x00a8, InvalidRefreshAuthTokensException -> 0x00d0, RefreshAuthTokensFailedException -> 0x00d3, TryCatch #2 {InvalidRefreshAuthTokensException -> 0x00d0, RefreshAuthTokensFailedException -> 0x00d3, ChaloLocalException -> 0x003e, NetworkSuccessResponseParseException -> 0x00a8, blocks: (B:17:0x003a, B:43:0x0084, B:22:0x0044, B:36:0x006b, B:38:0x006f, B:40:0x0072, B:23:0x0048, B:29:0x0058, B:31:0x005d, B:33:0x0060, B:26:0x004f), top: B:78:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[Catch: ChaloLocalException -> 0x003e, NetworkSuccessResponseParseException -> 0x00a8, InvalidRefreshAuthTokensException -> 0x00d0, RefreshAuthTokensFailedException -> 0x00d3, TryCatch #2 {InvalidRefreshAuthTokensException -> 0x00d0, RefreshAuthTokensFailedException -> 0x00d3, ChaloLocalException -> 0x003e, NetworkSuccessResponseParseException -> 0x00a8, blocks: (B:17:0x003a, B:43:0x0084, B:22:0x0044, B:36:0x006b, B:38:0x006f, B:40:0x0072, B:23:0x0048, B:29:0x0058, B:31:0x005d, B:33:0x0060, B:26:0x004f), top: B:78:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084 A[Catch: ChaloLocalException -> 0x003e, NetworkSuccessResponseParseException -> 0x00a8, InvalidRefreshAuthTokensException -> 0x00d0, RefreshAuthTokensFailedException -> 0x00d3, PHI: r9
      0x0084: PHI (r9v18 java.lang.Object) = (r9v16 java.lang.Object), (r9v1 java.lang.Object) binds: [B:41:0x0081, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {InvalidRefreshAuthTokensException -> 0x00d0, RefreshAuthTokensFailedException -> 0x00d3, ChaloLocalException -> 0x003e, NetworkSuccessResponseParseException -> 0x00a8, blocks: (B:17:0x003a, B:43:0x0084, B:22:0x0044, B:36:0x006b, B:38:0x006f, B:40:0x0072, B:23:0x0048, B:29:0x0058, B:31:0x005d, B:33:0x0060, B:26:0x004f), top: B:78:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if (r9 == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.domain.RefreshAuthTokensForUserUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }
}
