package app.chalo.ncmc.data.appmodel;

import app.chalo.ncmc.uvik.UvikServiceRequest;
import app.chalo.ncmc.uvik.UvikServiceType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntentHashAppModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6148a;

        static {
            int[] iArr = new int[UvikServiceType.values().length];
            try {
                iArr[UvikServiceType.BALANCE_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UvikServiceType.BALANCE_ENQUIRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UvikServiceType.SERVICE_CREATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UvikServiceType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6148a = iArr;
        }
    }

    public static final UvikServiceRequest a(IntentHashAppModel intentHashAppModel, UvikServiceType serviceType) {
        Intrinsics.i(intentHashAppModel, "<this>");
        String str = intentHashAppModel.b;
        String str2 = intentHashAppModel.f6147a;
        String str3 = intentHashAppModel.c;
        Intrinsics.i(serviceType, "serviceType");
        int i = WhenMappings.f6148a[serviceType.ordinal()];
        if (i == 1) {
            return new UvikServiceRequest.BalanceUpdate(str3, str2, str);
        }
        if (i == 2) {
            return new UvikServiceRequest.BalanceEnquiry(str3, str2, str);
        }
        if (i != 3) {
            if (i == 4) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str4 = intentHashAppModel.d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = intentHashAppModel.e;
        if (str5 == null) {
            str5 = "";
        }
        return new UvikServiceRequest.Creation(str4, str5, intentHashAppModel.c, intentHashAppModel.f6147a, intentHashAppModel.b);
    }
}
