package app.chalo.login.data.models.app;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DpdpaUserConsentsInfoAppModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5192a;

        static {
            int[] iArr = new int[DpdpaConsentStatus.values().length];
            try {
                iArr[DpdpaConsentStatus.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DpdpaConsentStatus.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DpdpaConsentStatus.NOT_REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DpdpaConsentStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5192a = iArr;
        }
    }

    public static final boolean a(DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModel) {
        Intrinsics.i(dpdpaUserConsentsInfoAppModel, "<this>");
        ArrayList arrayList = dpdpaUserConsentsInfoAppModel.d;
        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                DpdpaConsentStatus dpdpaConsentStatus = ((DpdpaConsentInfoAppModel) obj).b;
                Intrinsics.i(dpdpaConsentStatus, "<this>");
                int i2 = WhenMappings.f5192a[dpdpaConsentStatus.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3 || i2 == 4) {
                        return true;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return false;
    }
}
