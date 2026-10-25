package app.chalo.kyc.min.domain;

import app.chalo.kyc.min.data.repository.MinKycRepository;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/domain/RegisterUserUseCase;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegisterUserUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4111a;
    public final MinKycRepository b;

    public RegisterUserUseCase(StringProvider stringProvider, MinKycRepository minKycRepository) {
        this.f4111a = stringProvider;
        this.b = minKycRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r10 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.kyc.min.domain.RegisterUserUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.kyc.min.domain.RegisterUserUseCase$invoke$1 r0 = (app.chalo.kyc.min.domain.RegisterUserUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.kyc.min.domain.RegisterUserUseCase$invoke$1 r0 = new app.chalo.kyc.min.domain.RegisterUserUseCase$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            app.chalo.providers.stringprovider.StringProvider r4 = r8.f4111a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L42
            if (r2 == r7) goto L3c
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            kotlin.ResultKt.b(r10)
            goto L6b
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.b(r10)
            goto L86
        L3c:
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L40 app.chalo.kyc.min.data.exceptions.RegisterUserApiException -> L79
            goto L50
        L40:
            r9 = move-exception
            goto L58
        L42:
            kotlin.ResultKt.b(r10)
            app.chalo.kyc.min.data.repository.MinKycRepository r10 = r8.b     // Catch: java.lang.Exception -> L40 app.chalo.kyc.min.data.exceptions.RegisterUserApiException -> L79
            r0.label = r7     // Catch: java.lang.Exception -> L40 app.chalo.kyc.min.data.exceptions.RegisterUserApiException -> L79
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Exception -> L40 app.chalo.kyc.min.data.exceptions.RegisterUserApiException -> L79
            if (r10 != r1) goto L50
            goto L85
        L50:
            app.chalo.kyc.min.data.models.appmodels.MinKycRegisterAppModel r10 = (app.chalo.kyc.min.data.models.appmodels.MinKycRegisterAppModel) r10     // Catch: java.lang.Exception -> L40 app.chalo.kyc.min.data.exceptions.RegisterUserApiException -> L79
            app.chalo.utils.ChaloUseCaseResult$Success r9 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: java.lang.Exception -> L40 app.chalo.kyc.min.data.exceptions.RegisterUserApiException -> L79
            r9.<init>(r10)     // Catch: java.lang.Exception -> L40 app.chalo.kyc.min.data.exceptions.RegisterUserApiException -> L79
            return r9
        L58:
            java.lang.String r9 = r9.getMessage()
            if (r9 != 0) goto L6e
            app.chalo.providers.stringprovider.StringEnum r9 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r0.label = r5
            java.lang.Object r10 = r4.b(r9, r10, r0)
            if (r10 != r1) goto L6b
            goto L85
        L6b:
            r9 = r10
            java.lang.String r9 = (java.lang.String) r9
        L6e:
            app.chalo.kyc.min.ui.RegisterUserError$GenericError r10 = new app.chalo.kyc.min.ui.RegisterUserError$GenericError
            r10.<init>(r9)
            app.chalo.utils.ChaloUseCaseResult$Failure r9 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r9.<init>(r10)
            goto L93
        L79:
            app.chalo.providers.stringprovider.StringEnum r9 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r0.label = r6
            java.lang.Object r10 = r4.b(r9, r10, r0)
            if (r10 != r1) goto L86
        L85:
            return r1
        L86:
            java.lang.String r10 = (java.lang.String) r10
            app.chalo.kyc.min.ui.RegisterUserError$RegisterUserUiError r9 = new app.chalo.kyc.min.ui.RegisterUserError$RegisterUserUiError
            r9.<init>(r10)
            app.chalo.utils.ChaloUseCaseResult$Failure r10 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r10.<init>(r9)
            r9 = r10
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.domain.RegisterUserUseCase.a(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
