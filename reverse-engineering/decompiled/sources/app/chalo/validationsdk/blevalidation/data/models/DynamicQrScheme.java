package app.chalo.validationsdk.blevalidation.data.models;

import androidx.webkit.Profile;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme;", "", Profile.DEFAULT_PROFILE_NAME, "BmrclMetro", "Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme$BmrclMetro;", "Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme$Default;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DynamicQrScheme {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme$BmrclMetro;", "Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BmrclMetro implements DynamicQrScheme {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10472a;
        public final double b;
        public final double c;

        public BmrclMetro(String str, double d, double d2) {
            this.f10472a = str;
            this.b = d;
            this.c = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BmrclMetro)) {
                return false;
            }
            BmrclMetro bmrclMetro = (BmrclMetro) obj;
            return this.f10472a.equals(bmrclMetro.f10472a) && Double.compare(this.b, bmrclMetro.b) == 0 && Double.compare(this.c, bmrclMetro.c) == 0;
        }

        public final int hashCode() {
            int iHashCode = this.f10472a.hashCode() * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.b);
            int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.c);
            return (i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        }

        public final String toString() {
            return "BmrclMetro(qrStatus=" + this.f10472a + ", latitude=" + this.b + ", longitude=" + this.c + ", operatorSpecificData=)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme$Default;", "Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default implements DynamicQrScheme {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f10473a = new Default();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return -1683220587;
        }

        public final String toString() {
            return Profile.DEFAULT_PROFILE_NAME;
        }
    }
}
