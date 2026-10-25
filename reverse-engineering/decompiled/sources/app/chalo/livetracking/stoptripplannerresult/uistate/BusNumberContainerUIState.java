package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusNumberContainerUIState;", "", "BusNumberAndCtaUiState", "WithoutCta", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusNumberContainerUIState$BusNumberAndCtaUiState;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusNumberContainerUIState$WithoutCta;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BusNumberContainerUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusNumberContainerUIState$BusNumberAndCtaUiState;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusNumberContainerUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BusNumberAndCtaUiState extends BusNumberContainerUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BusNumberAndCtaSpecs f4576a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final BusInfoCtaUiState d;

        public BusNumberAndCtaUiState(TextUIState.ChaloTextUIState busNumberLabel, TextUIState.ChaloTextUIState busNumber, BusInfoCtaUiState busInfoCtaUiState) {
            BusNumberAndCtaSpecs busNumberAndCtaSpecs = new BusNumberAndCtaSpecs();
            Intrinsics.i(busNumberLabel, "busNumberLabel");
            Intrinsics.i(busNumber, "busNumber");
            this.f4576a = busNumberAndCtaSpecs;
            this.b = busNumberLabel;
            this.c = busNumber;
            this.d = busInfoCtaUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BusNumberAndCtaUiState)) {
                return false;
            }
            BusNumberAndCtaUiState busNumberAndCtaUiState = (BusNumberAndCtaUiState) obj;
            return Intrinsics.d(this.f4576a, busNumberAndCtaUiState.f4576a) && Intrinsics.d(this.b, busNumberAndCtaUiState.b) && Intrinsics.d(this.c, busNumberAndCtaUiState.c) && Intrinsics.d(this.d, busNumberAndCtaUiState.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + r30.f(this.c, r30.f(this.b, this.f4576a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "BusNumberAndCtaUiState(specs=" + this.f4576a + ", busNumberLabel=" + this.b + ", busNumber=" + this.c + ", cta=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusNumberContainerUIState$WithoutCta;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusNumberContainerUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithoutCta extends BusNumberContainerUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.StyledTextUIState f4577a;

        public WithoutCta(TextUIState.StyledTextUIState styledTextUIState) {
            this.f4577a = styledTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithoutCta) && Intrinsics.d(this.f4577a, ((WithoutCta) obj).f4577a);
        }

        public final int hashCode() {
            return this.f4577a.hashCode();
        }

        public final String toString() {
            return "WithoutCta(busNumber=" + this.f4577a + ")";
        }
    }
}
