package app.chalo.ncmc.uvik;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.PlatformFeature;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikSdkHelperImpl;", "Lapp/chalo/ncmc/uvik/UvikSdkHelper;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UvikSdkHelperImpl implements UvikSdkHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f6446a;
    public final UvikSdkManager b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikSdkHelperImpl$Companion;", "", "", "ACTION_TRANSACTION", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public UvikSdkHelperImpl(UvikSdkManagerProvider uvikSdkManagerProvider, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f6446a = userProfileDetailsProvider;
        this.b = uvikSdkManagerProvider.b();
    }

    @Override // app.chalo.ncmc.uvik.UvikSdkHelper
    public final boolean a() {
        return this.b.b();
    }

    @Override // app.chalo.ncmc.uvik.UvikSdkHelper
    public final Flow b(UvikServiceRequest serviceRequest) {
        String str;
        String str2;
        Intrinsics.i(serviceRequest, "serviceRequest");
        UserProfileAppModel userProfileAppModelF = this.f6446a.f();
        if (userProfileAppModelF == null || (str = userProfileAppModelF.e) == null) {
            str = "";
        }
        String str3 = str;
        String b = serviceRequest.getB();
        UvikServiceType uvikServiceType = serviceRequest.f6449a;
        String d = serviceRequest.getD();
        String c = serviceRequest.getC();
        boolean z = serviceRequest instanceof UvikServiceRequest.Creation;
        String str4 = null;
        if (z) {
            str2 = ((UvikServiceRequest.Creation) serviceRequest).e;
        } else {
            if (!(serviceRequest instanceof UvikServiceRequest.BalanceEnquiry) && !(serviceRequest instanceof UvikServiceRequest.BalanceUpdate)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = null;
        }
        if (z) {
            str4 = ((UvikServiceRequest.Creation) serviceRequest).f;
        } else if (!(serviceRequest instanceof UvikServiceRequest.BalanceEnquiry) && !(serviceRequest instanceof UvikServiceRequest.BalanceUpdate)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.b.a(new UvikIntentData(str3, b, uvikServiceType, d, c, str2, str4));
    }

    @Override // app.chalo.ncmc.uvik.UvikSdkHelper
    public final void c() {
        float f = PlatformFeature.f10436a;
    }
}
