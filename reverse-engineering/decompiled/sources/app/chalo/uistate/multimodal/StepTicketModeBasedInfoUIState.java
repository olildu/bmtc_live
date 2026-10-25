package app.chalo.uistate.multimodal;

import app.chalo.uistate.fromto.MultipleFromToStopUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/multimodal/StepTicketModeBasedInfoUIState;", "", "Bus", "Metro", "Lapp/chalo/uistate/multimodal/StepTicketModeBasedInfoUIState$Bus;", "Lapp/chalo/uistate/multimodal/StepTicketModeBasedInfoUIState$Metro;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StepTicketModeBasedInfoUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/StepTicketModeBasedInfoUIState$Bus;", "Lapp/chalo/uistate/multimodal/StepTicketModeBasedInfoUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bus extends StepTicketModeBasedInfoUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StepTicketBusModeInfoUISpecs f10056a = new StepTicketBusModeInfoUISpecs();
        public final ImageUIState b;
        public final TextWithSpecialFeaturesTagsUIState c;
        public final FromAndToStopUIState d;

        public Bus(ImageUIState imageUIState, TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState, FromAndToStopUIState fromAndToStopUIState) {
            this.b = imageUIState;
            this.c = textWithSpecialFeaturesTagsUIState;
            this.d = fromAndToStopUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bus)) {
                return false;
            }
            Bus bus = (Bus) obj;
            return Intrinsics.d(this.f10056a, bus.f10056a) && Intrinsics.d(this.b, bus.b) && Intrinsics.d(this.c, bus.c) && Intrinsics.d(this.d, bus.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + r30.e(this.b, this.f10056a.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "Bus(specs=" + this.f10056a + ", modeIconUIState=" + this.b + ", routeNameWithSpecialFeatures=" + this.c + ", fromAndToStopUIState=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/StepTicketModeBasedInfoUIState$Metro;", "Lapp/chalo/uistate/multimodal/StepTicketModeBasedInfoUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Metro extends StepTicketModeBasedInfoUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StepTicketMetroModeInfoUISpecs f10057a = new StepTicketMetroModeInfoUISpecs();
        public final ImageUIState b;
        public final ArrayList c;
        public final MultipleFromToStopUIState d;

        public Metro(ImageUIState imageUIState, ArrayList arrayList, MultipleFromToStopUIState multipleFromToStopUIState) {
            this.b = imageUIState;
            this.c = arrayList;
            this.d = multipleFromToStopUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metro)) {
                return false;
            }
            Metro metro = (Metro) obj;
            return Intrinsics.d(this.f10057a, metro.f10057a) && Intrinsics.d(this.b, metro.b) && Intrinsics.d(this.c, metro.c) && Intrinsics.d(this.d, metro.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + xs.e(this.c, r30.e(this.b, this.f10057a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "Metro(specs=" + this.f10057a + ", modeIconUIState=" + this.b + ", metroLineContainerUIStateList=" + this.c + ", multipleFromToStopUIState=" + this.d + ")";
        }
    }
}
