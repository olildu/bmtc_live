package app.chalo.home.ui.chalobus;

import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType;", "", "BuyPassNudge", "Tutorial", "WhatsNewPlotline", "Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType$BuyPassNudge;", "Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType$Tutorial;", "Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType$WhatsNewPlotline;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBusLandingSectionType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType$BuyPassNudge;", "Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuyPassNudge extends ChaloBusLandingSectionType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductPurchaseNudgeInfo f3245a;

        public BuyPassNudge(ProductPurchaseNudgeInfo productPurchaseNudgeInfo) {
            this.f3245a = productPurchaseNudgeInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyPassNudge) && Intrinsics.d(this.f3245a, ((BuyPassNudge) obj).f3245a);
        }

        public final int hashCode() {
            return this.f3245a.hashCode();
        }

        public final String toString() {
            return "BuyPassNudge(productPurchaseNudgeInfo=" + this.f3245a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType$Tutorial;", "Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tutorial extends ChaloBusLandingSectionType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3246a;

        public Tutorial(List list) {
            this.f3246a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Tutorial) && Intrinsics.d(this.f3246a, ((Tutorial) obj).f3246a);
        }

        public final int hashCode() {
            return this.f3246a.hashCode();
        }

        public final String toString() {
            return r1.d("Tutorial(banners=", ")", this.f3246a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType$WhatsNewPlotline;", "Lapp/chalo/home/ui/chalobus/ChaloBusLandingSectionType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WhatsNewPlotline extends ChaloBusLandingSectionType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3247a;

        public WhatsNewPlotline(String str) {
            this.f3247a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WhatsNewPlotline) && Intrinsics.d(this.f3247a, ((WhatsNewPlotline) obj).f3247a);
        }

        public final int hashCode() {
            String str = this.f3247a;
            return ((str == null ? 0 : str.hashCode()) * 31) - 1689983270;
        }

        public final String toString() {
            return vo1.B("WhatsNewPlotline(widgetHeaderTitle=", this.f3247a, ", plotlineWidgetId=pbLandingOffersAndPasses)");
        }
    }
}
