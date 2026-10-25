package app.chalo.uistate.color;

import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b7\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/uistate/color/ColorGradiantUiState;", "", "Linear", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ColorGradiantUiState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/color/ColorGradiantUiState$Linear;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Linear {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f9929a;

        public Linear(List colors) {
            Intrinsics.i(colors, "colors");
            this.f9929a = colors;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Linear) && Intrinsics.d(this.f9929a, ((Linear) obj).f9929a);
        }

        public final int hashCode() {
            return this.f9929a.hashCode() * 961;
        }

        public final String toString() {
            return r1.d("Linear(colors=", ", start=null, end=null)", this.f9929a);
        }
    }
}
