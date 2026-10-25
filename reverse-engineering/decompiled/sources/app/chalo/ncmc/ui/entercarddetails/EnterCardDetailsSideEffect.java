package app.chalo.ncmc.ui.entercarddetails;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsSideEffect;", "", "HideKeyboard", "FocusOnReEnterEnterCardNumberField", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsSideEffect$FocusOnReEnterEnterCardNumberField;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsSideEffect$HideKeyboard;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EnterCardDetailsSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsSideEffect$FocusOnReEnterEnterCardNumberField;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FocusOnReEnterEnterCardNumberField extends EnterCardDetailsSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FocusOnReEnterEnterCardNumberField f6334a = new FocusOnReEnterEnterCardNumberField();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FocusOnReEnterEnterCardNumberField);
        }

        public final int hashCode() {
            return -375284766;
        }

        public final String toString() {
            return "FocusOnReEnterEnterCardNumberField";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsSideEffect$HideKeyboard;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideKeyboard extends EnterCardDetailsSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HideKeyboard f6335a = new HideKeyboard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HideKeyboard);
        }

        public final int hashCode() {
            return -304231244;
        }

        public final String toString() {
            return "HideKeyboard";
        }
    }
}
