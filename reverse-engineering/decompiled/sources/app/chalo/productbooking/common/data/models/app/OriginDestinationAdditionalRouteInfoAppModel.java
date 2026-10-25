package app.chalo.productbooking.common.data.models.app;

import defpackage.eo0;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel;", "", "Companion", "Metro", "Bus", "Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel$Bus;", "Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel$Metro;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class OriginDestinationAdditionalRouteInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8189a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new eo0(1));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel$Bus;", "Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Bus extends OriginDestinationAdditionalRouteInfoAppModel {
        public static final Bus b = new Bus();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<OriginDestinationAdditionalRouteInfoAppModel> serializer() {
            return (KSerializer) OriginDestinationAdditionalRouteInfoAppModel.f8189a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel$Metro;", "Lapp/chalo/productbooking/common/data/models/app/OriginDestinationAdditionalRouteInfoAppModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Metro extends OriginDestinationAdditionalRouteInfoAppModel {
        public final String b;

        public Metro(String lineColor) {
            Intrinsics.i(lineColor, "lineColor");
            this.b = lineColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metro) && Intrinsics.d(this.b, ((Metro) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Metro(lineColor=", this.b, ")");
        }
    }
}
