package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import defpackage.py;
import defpackage.r30;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketRouteDetailsHeader;", "", "SingleTicket", "MultipleLegsTicket", "Lapp/chalo/productactivation/ui/uistate/ActivationTicketRouteDetailsHeader$MultipleLegsTicket;", "Lapp/chalo/productactivation/ui/uistate/ActivationTicketRouteDetailsHeader$SingleTicket;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ActivationTicketRouteDetailsHeader {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketRouteDetailsHeader$MultipleLegsTicket;", "Lapp/chalo/productactivation/ui/uistate/ActivationTicketRouteDetailsHeader;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleLegsTicket extends ActivationTicketRouteDetailsHeader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f8061a;
        public final ImageUIState b;
        public final ChaloPadding c;

        public MultipleLegsTicket(ArrayList arrayList, ImageUIState imageUIState) {
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 2);
            this.f8061a = arrayList;
            this.b = imageUIState;
            this.c = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultipleLegsTicket)) {
                return false;
            }
            MultipleLegsTicket multipleLegsTicket = (MultipleLegsTicket) obj;
            return Intrinsics.d(this.f8061a, multipleLegsTicket.f8061a) && Intrinsics.d(this.b, multipleLegsTicket.b) && Intrinsics.d(this.c, multipleLegsTicket.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + r30.e(this.b, this.f8061a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultipleLegsTicket(modeIconList=");
            sb.append(this.f8061a);
            sb.append(", modeSwitchImgUIState=");
            sb.append(this.b);
            sb.append(", switchIconPadding=");
            return py.e(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketRouteDetailsHeader$SingleTicket;", "Lapp/chalo/productactivation/ui/uistate/ActivationTicketRouteDetailsHeader;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleTicket extends ActivationTicketRouteDetailsHeader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f8062a;
        public final TextWithSpecialFeaturesTagsUIState b;

        public SingleTicket(ImageUIState imageUIState, TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState) {
            this.f8062a = imageUIState;
            this.b = textWithSpecialFeaturesTagsUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleTicket)) {
                return false;
            }
            SingleTicket singleTicket = (SingleTicket) obj;
            return Intrinsics.d(this.f8062a, singleTicket.f8062a) && Intrinsics.d(this.b, singleTicket.b);
        }

        public final int hashCode() {
            ImageUIState imageUIState = this.f8062a;
            int iHashCode = (imageUIState == null ? 0 : imageUIState.hashCode()) * 31;
            TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = this.b;
            return iHashCode + (textWithSpecialFeaturesTagsUIState != null ? textWithSpecialFeaturesTagsUIState.hashCode() : 0);
        }

        public final String toString() {
            return "SingleTicket(icon=" + this.f8062a + ", routeNameWithSpecialFeatures=" + this.b + ")";
        }
    }
}
