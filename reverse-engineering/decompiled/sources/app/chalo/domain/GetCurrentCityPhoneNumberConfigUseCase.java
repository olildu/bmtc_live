package app.chalo.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetCurrentCityPhoneNumberConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetCurrentCityPhoneNumberConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f2495a;

    public GetCurrentCityPhoneNumberConfigUseCase(UserProfileDetailsProvider userProfileDetailsProvider, GetSupportedChaloCountryListUseCase getSupportedChaloCountryListUseCase) {
        this.f2495a = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r6 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase$invoke$1 r0 = (app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase$invoke$1 r0 = new app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase$invoke$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L44
        L36:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            app.chalo.providers.UserProfileDetailsProvider r6 = r5.f2495a
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.v(r6, r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            app.chalo.config.CountryPhoneNumberConfig r6 = (app.chalo.config.CountryPhoneNumberConfig) r6
            if (r6 != 0) goto L98
            java.util.ArrayList r6 = app.chalo.domain.GetSupportedChaloCountryListUseCase.a()
            int r0 = r6.size()
            r1 = 0
        L5c:
            if (r1 >= r0) goto L6e
            java.lang.Object r2 = r6.get(r1)
            int r1 = r1 + 1
            r3 = r2
            app.chalo.config.CountryPhoneNumberConfig r3 = (app.chalo.config.CountryPhoneNumberConfig) r3
            app.chalo.config.ChaloPhoneNumberCountry r3 = r3.f1937a
            app.chalo.config.ChaloPhoneNumberCountry r4 = app.chalo.config.ChaloPhoneNumberCountry.India
            if (r3 != r4) goto L5c
            goto L6f
        L6e:
            r2 = 0
        L6f:
            app.chalo.config.CountryPhoneNumberConfig r2 = (app.chalo.config.CountryPhoneNumberConfig) r2
            if (r2 != 0) goto L97
            app.chalo.config.CountryPhoneNumberConfig r6 = new app.chalo.config.CountryPhoneNumberConfig
            app.chalo.config.ChaloPhoneNumberCountry$Companion r0 = app.chalo.config.ChaloPhoneNumberCountry.INSTANCE
            r0.getClass()
            app.chalo.config.ChaloPhoneNumberCountry r0 = app.chalo.config.ChaloPhoneNumberCountry.access$getDefault$cp()
            java.util.List r1 = app.chalo.constants.AppConstants.f1940a
            java.lang.Object r1 = kotlin.collections.CollectionsKt.H(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L8d
            int r1 = r1.intValue()
            goto L8f
        L8d:
            r1 = 10
        L8f:
            java.lang.String r2 = "India"
            java.lang.String r3 = "+91"
            r6.<init>(r0, r2, r3, r1)
            return r6
        L97:
            return r2
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
