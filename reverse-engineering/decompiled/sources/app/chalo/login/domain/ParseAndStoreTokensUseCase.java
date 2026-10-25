package app.chalo.login.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.login.data.repository.LoginRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/ParseAndStoreTokensUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParseAndStoreTokensUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5243a;
    public final BasicInfoContract b;

    public ParseAndStoreTokensUseCase(LoginRepository loginRepository, JwtEncodedAccessTokenParser jwtEncodedAccessTokenParser, BasicInfoContract basicInfoContract) {
        this.f5243a = loginRepository;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r1.l(r2, r14, r4, r5, r6) == r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.login.data.models.app.PostLoginAuthTokensAppModel r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof app.chalo.login.domain.ParseAndStoreTokensUseCase$invoke$1
            if (r0 == 0) goto L14
            r0 = r15
            app.chalo.login.domain.ParseAndStoreTokensUseCase$invoke$1 r0 = (app.chalo.login.domain.ParseAndStoreTokensUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.login.domain.ParseAndStoreTokensUseCase$invoke$1 r0 = new app.chalo.login.domain.ParseAndStoreTokensUseCase$invoke$1
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r7 = 1
            if (r1 == 0) goto L45
            if (r1 == r7) goto L35
            if (r1 != r2) goto L2d
            kotlin.ResultKt.b(r15)     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            goto L92
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            java.lang.Object r14 = r6.L$1
            app.chalo.login.domain.ParsedTokenResult r14 = (app.chalo.login.domain.ParsedTokenResult) r14
            java.lang.Object r1 = r6.L$0
            app.chalo.login.data.models.app.PostLoginAuthTokensAppModel r1 = (app.chalo.login.data.models.app.PostLoginAuthTokensAppModel) r1
            kotlin.ResultKt.b(r15)     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r12 = r15
            r15 = r14
            r14 = r1
            r1 = r12
            goto L5d
        L45:
            kotlin.ResultKt.b(r15)
            java.lang.String r15 = r14.f5199a     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            app.chalo.login.domain.ParsedTokenResult r15 = app.chalo.login.domain.JwtEncodedAccessTokenParser.b(r15)     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            app.chalo.contract.BasicInfoContract r1 = r13.b     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r6.L$0 = r14     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r6.L$1 = r15     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r6.label = r7     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            java.lang.Object r1 = r1.c(r6)     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            if (r1 != r0) goto L5d
            goto L90
        L5d:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            long r3 = r1.longValue()     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r1 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r1     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            long r3 = r3 / r8
            app.chalo.login.data.repository.LoginRepository r1 = r13.f5243a     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r5 = r2
            java.lang.String r2 = r14.f5199a     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            java.lang.String r14 = r14.b     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r8 = r3
            java.lang.Long r4 = r15.f5244a     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            java.lang.Long r15 = r15.b     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            if (r15 == 0) goto L7a
            long r10 = r15.longValue()     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            goto L7b
        L7a:
            r10 = r8
        L7b:
            long r8 = r8 - r10
            r15 = r5
            java.lang.Long r5 = new java.lang.Long     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r5.<init>(r8)     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r3 = 0
            r6.L$0 = r3     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r6.L$1 = r3     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r6.label = r15     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            r3 = r14
            java.lang.Object r14 = r1.l(r2, r3, r4, r5, r6)     // Catch: app.chalo.login.domain.AccessTokenParseFailedException -> L91
            if (r14 != r0) goto L92
        L90:
            return r0
        L91:
            r7 = 0
        L92:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r7)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.domain.ParseAndStoreTokensUseCase.a(app.chalo.login.data.models.app.PostLoginAuthTokensAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
