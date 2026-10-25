package app.chalo.metro.ui.landing;

import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLineListItemState;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroLineListItemState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcMetroRouteSearchAppModel f5509a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLineListItemState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/ui/landing/MetroLineListItemState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroLineListItemState> serializer() {
            return MetroLineListItemState$$serializer.f5510a;
        }
    }

    public /* synthetic */ MetroLineListItemState(int i, OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel, boolean z) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(MetroLineListItemState$$serializer.f5510a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5509a = ondcMetroRouteSearchAppModel;
        this.b = z;
    }

    public static MetroLineListItemState a(MetroLineListItemState metroLineListItemState, boolean z) {
        OndcMetroRouteSearchAppModel lineDetails = metroLineListItemState.f5509a;
        metroLineListItemState.getClass();
        Intrinsics.i(lineDetails, "lineDetails");
        return new MetroLineListItemState(lineDetails, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLineListItemState)) {
            return false;
        }
        MetroLineListItemState metroLineListItemState = (MetroLineListItemState) obj;
        return Intrinsics.d(this.f5509a, metroLineListItemState.f5509a) && this.b == metroLineListItemState.b;
    }

    public final int hashCode() {
        return (this.f5509a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "MetroLineListItemState(lineDetails=" + this.f5509a + ", isSelected=" + this.b + ")";
    }

    public MetroLineListItemState(OndcMetroRouteSearchAppModel lineDetails, boolean z) {
        Intrinsics.i(lineDetails, "lineDetails");
        this.f5509a = lineDetails;
        this.b = z;
    }
}
