package app.chalo.ncmc.ui.cardlinking.linking;

import app.chalo.constants.Source;
import defpackage.gf;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent;", "", "InitializationLinkIntent", "OnCardLinkNumberEntered", "OnLinkCodeEnteredLink", "ProceedClickedLinkIntent", "CardAlreadyLinkedErrorDialogOkClickedLinkIntent", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$CardAlreadyLinkedErrorDialogOkClickedLinkIntent;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$InitializationLinkIntent;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$OnCardLinkNumberEntered;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$OnLinkCodeEnteredLink;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$ProceedClickedLinkIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloCardLinkIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$CardAlreadyLinkedErrorDialogOkClickedLinkIntent;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardAlreadyLinkedErrorDialogOkClickedLinkIntent extends ChaloCardLinkIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardAlreadyLinkedErrorDialogOkClickedLinkIntent f6272a = new CardAlreadyLinkedErrorDialogOkClickedLinkIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardAlreadyLinkedErrorDialogOkClickedLinkIntent);
        }

        public final int hashCode() {
            return -1107283558;
        }

        public final String toString() {
            return "CardAlreadyLinkedErrorDialogOkClickedLinkIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$InitializationLinkIntent;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationLinkIntent extends ChaloCardLinkIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f6273a;

        public InitializationLinkIntent(Source source) {
            Intrinsics.i(source, "source");
            this.f6273a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationLinkIntent) && this.f6273a == ((InitializationLinkIntent) obj).f6273a;
        }

        public final int hashCode() {
            return this.f6273a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f6273a, "InitializationLinkIntent(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$OnCardLinkNumberEntered;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnCardLinkNumberEntered extends ChaloCardLinkIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6274a;

        public OnCardLinkNumberEntered(String enteredString) {
            Intrinsics.i(enteredString, "enteredString");
            this.f6274a = enteredString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCardLinkNumberEntered) && Intrinsics.d(this.f6274a, ((OnCardLinkNumberEntered) obj).f6274a);
        }

        public final int hashCode() {
            return this.f6274a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnCardLinkNumberEntered(enteredString=", this.f6274a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$OnLinkCodeEnteredLink;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnLinkCodeEnteredLink extends ChaloCardLinkIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6275a;

        public OnLinkCodeEnteredLink(String enteredString) {
            Intrinsics.i(enteredString, "enteredString");
            this.f6275a = enteredString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLinkCodeEnteredLink) && Intrinsics.d(this.f6275a, ((OnLinkCodeEnteredLink) obj).f6275a);
        }

        public final int hashCode() {
            return this.f6275a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnLinkCodeEnteredLink(enteredString=", this.f6275a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent$ProceedClickedLinkIntent;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedClickedLinkIntent extends ChaloCardLinkIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedClickedLinkIntent f6276a = new ProceedClickedLinkIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProceedClickedLinkIntent);
        }

        public final int hashCode() {
            return -1553040505;
        }

        public final String toString() {
            return "ProceedClickedLinkIntent";
        }
    }
}
