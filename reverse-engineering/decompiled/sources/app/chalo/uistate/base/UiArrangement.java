package app.chalo.uistate.base;

import androidx.compose.ui.unit.Dp;
import defpackage.vo1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement;", "", "Vertical", "Horizontal", "HorizontalOrVertical", "Lapp/chalo/uistate/base/UiArrangement$Horizontal;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical;", "Lapp/chalo/uistate/base/UiArrangement$Vertical;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UiArrangement {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$Horizontal;", "Lapp/chalo/uistate/base/UiArrangement;", "Start", "End", "Lapp/chalo/uistate/base/UiArrangement$Horizontal$End;", "Lapp/chalo/uistate/base/UiArrangement$Horizontal$Start;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Horizontal extends UiArrangement {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$Horizontal$End;", "Lapp/chalo/uistate/base/UiArrangement$Horizontal;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class End extends Horizontal {
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$Horizontal$Start;", "Lapp/chalo/uistate/base/UiArrangement$Horizontal;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Start extends Horizontal {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical;", "Lapp/chalo/uistate/base/UiArrangement;", "Center", "SpaceEvenly", "SpaceBetween", "SpaceAround", "SpacedBy", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$Center;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$SpaceAround;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$SpaceBetween;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$SpaceEvenly;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$SpacedBy;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class HorizontalOrVertical extends UiArrangement {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$Center;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Center extends HorizontalOrVertical {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Center f9890a = new Center();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$SpaceAround;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpaceAround extends HorizontalOrVertical {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SpaceAround f9891a = new SpaceAround();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$SpaceBetween;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpaceBetween extends HorizontalOrVertical {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SpaceBetween f9892a = new SpaceBetween();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$SpaceEvenly;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpaceEvenly extends HorizontalOrVertical {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SpaceEvenly f9893a = new SpaceEvenly();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical$SpacedBy;", "Lapp/chalo/uistate/base/UiArrangement$HorizontalOrVertical;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SpacedBy extends HorizontalOrVertical {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f9894a;

            public SpacedBy(float f) {
                this.f9894a = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SpacedBy) && Dp.m7283equalsimpl0(this.f9894a, ((SpacedBy) obj).f9894a);
            }

            public final int hashCode() {
                return Dp.m7284hashCodeimpl(this.f9894a);
            }

            public final String toString() {
                return vo1.B("SpacedBy(spacing=", Dp.m7289toStringimpl(this.f9894a), ")");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$Vertical;", "Lapp/chalo/uistate/base/UiArrangement;", "Top", "Bottom", "Lapp/chalo/uistate/base/UiArrangement$Vertical$Bottom;", "Lapp/chalo/uistate/base/UiArrangement$Vertical$Top;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Vertical extends UiArrangement {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$Vertical$Bottom;", "Lapp/chalo/uistate/base/UiArrangement$Vertical;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Bottom extends Vertical {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Bottom f9895a = new Bottom();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/UiArrangement$Vertical$Top;", "Lapp/chalo/uistate/base/UiArrangement$Vertical;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Top extends Vertical {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Top f9896a = new Top();
        }
    }
}
