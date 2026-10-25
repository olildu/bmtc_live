package app.chalo.home.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.productdatasync.repository.IProductDataSyncRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/AutoLinkDeviceIdUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoLinkDeviceIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f2985a;
    public final UserProfileDetailsProvider b;
    public final StringProvider c;
    public final IProductDataSyncRepository d;

    public AutoLinkDeviceIdUseCase(BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, StringProvider stringProvider, IProductDataSyncRepository iProductDataSyncRepository) {
        this.f2985a = basicInfoContract;
        this.b = userProfileDetailsProvider;
        this.c = stringProvider;
        this.d = iProductDataSyncRepository;
    }

    public static ChaloUseCaseResult.Failure a(AutoLinkDeviceIdFailureReason autoLinkDeviceIdFailureReason, String str) {
        return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(autoLinkDeviceIdFailureReason), autoLinkDeviceIdFailureReason.getErrorCode(), str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r8 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.AutoLinkDeviceIdUseCase.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
