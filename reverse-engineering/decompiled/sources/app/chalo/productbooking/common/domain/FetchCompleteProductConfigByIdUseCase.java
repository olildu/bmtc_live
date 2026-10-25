package app.chalo.productbooking.common.domain;

import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/FetchCompleteProductConfigByIdUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchCompleteProductConfigByIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f8260a;
    public final UserProfileDetailsProvider b;
    public final IUserPreferencesDataStore c;

    public FetchCompleteProductConfigByIdUseCase(PremiumBusRepository premiumBusRepository, UserProfileDetailsProvider userProfileDetailsProvider, IUserPreferencesDataStore iUserPreferencesDataStore) {
        this.f8260a = premiumBusRepository;
        this.b = userProfileDetailsProvider;
        this.c = iUserPreferencesDataStore;
    }

    public static /* synthetic */ Object b(FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, String str, String str2, String str3, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return fetchCompleteProductConfigByIdUseCase.a(str, str2, str3, null, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ef, code lost:
    
        if (r15 == r0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
