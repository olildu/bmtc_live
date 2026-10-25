package app.chalo.home.ui.chalobus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent;", "", "BackClicked", "TutorialClicked", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent$BackClicked;", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent$TutorialClicked;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusTutorialViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent$BackClicked;", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackClicked extends PremiumBusTutorialViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClicked f3295a = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -1860886592;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent$TutorialClicked;", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TutorialClicked extends PremiumBusTutorialViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusTutorialConfigUiModel f3296a;

        public TutorialClicked(PremiumBusTutorialConfigUiModel premiumBusTutorialConfigUiModel) {
            this.f3296a = premiumBusTutorialConfigUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TutorialClicked) && Intrinsics.d(this.f3296a, ((TutorialClicked) obj).f3296a);
        }

        public final int hashCode() {
            return this.f3296a.hashCode();
        }

        public final String toString() {
            return "TutorialClicked(tutorial=" + this.f3296a + ")";
        }
    }
}
