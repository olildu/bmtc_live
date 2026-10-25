package app.chalo.home;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/CommonBottomSheetData;", "", "GenericBottomSheetData", "RideHailingUserFeedbackBottomSheetData", "Lapp/chalo/home/CommonBottomSheetData$GenericBottomSheetData;", "Lapp/chalo/home/CommonBottomSheetData$RideHailingUserFeedbackBottomSheetData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CommonBottomSheetData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/CommonBottomSheetData$RideHailingUserFeedbackBottomSheetData;", "Lapp/chalo/home/CommonBottomSheetData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RideHailingUserFeedbackBottomSheetData extends CommonBottomSheetData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RideHailingUserFeedbackBottomSheetData f2851a = new RideHailingUserFeedbackBottomSheetData();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RideHailingUserFeedbackBottomSheetData);
        }

        public final int hashCode() {
            return -2012459282;
        }

        public final String toString() {
            return "RideHailingUserFeedbackBottomSheetData";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/CommonBottomSheetData$GenericBottomSheetData;", "Lapp/chalo/home/CommonBottomSheetData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenericBottomSheetData extends CommonBottomSheetData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IconType f2850a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ChaloBottomSheetLayoutType f;

        public GenericBottomSheetData(IconType iconType, String title, String str, String positiveBtnText, String str2, ChaloBottomSheetLayoutType layoutType) {
            Intrinsics.i(title, "title");
            Intrinsics.i(positiveBtnText, "positiveBtnText");
            Intrinsics.i(layoutType, "layoutType");
            this.f2850a = iconType;
            this.b = title;
            this.c = str;
            this.d = positiveBtnText;
            this.e = str2;
            this.f = layoutType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenericBottomSheetData)) {
                return false;
            }
            GenericBottomSheetData genericBottomSheetData = (GenericBottomSheetData) obj;
            return this.f2850a == genericBottomSheetData.f2850a && Intrinsics.d(this.b, genericBottomSheetData.b) && Intrinsics.d(this.c, genericBottomSheetData.c) && Intrinsics.d(this.d, genericBottomSheetData.d) && Intrinsics.d(this.e, genericBottomSheetData.e) && Intrinsics.d(this.f, genericBottomSheetData.f);
        }

        public final int hashCode() {
            IconType iconType = this.f2850a;
            int iE = nf1.e((iconType == null ? 0 : iconType.hashCode()) * 31, 31, this.b);
            String str = this.c;
            int iE2 = nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            return this.f.hashCode() + ((iE2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GenericBottomSheetData(imageId=");
            sb.append(this.f2850a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", msg=");
            cb0.t(sb, this.c, ", positiveBtnText=", this.d, ", negativeBtnText=");
            sb.append(this.e);
            sb.append(", layoutType=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ GenericBottomSheetData(IconType iconType, String str, String str2, String str3, String str4, ChaloBottomSheetLayoutType chaloBottomSheetLayoutType, int i) {
            this((i & 1) != 0 ? null : iconType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ChaloBottomSheetLayoutType.Default.f2845a : chaloBottomSheetLayoutType);
        }
    }
}
