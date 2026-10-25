package app.chalo.multimodalticket.data.model.api;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModelSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketLegApiModelSerializer extends JsonContentPolymorphicSerializer<GroupTicketLegApiModel> {
    public static final GroupTicketLegApiModelSerializer c = new GroupTicketLegApiModelSerializer(Reflection.a(GroupTicketLegApiModel.class));

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public final DeserializationStrategy a(JsonElement element) {
        Intrinsics.i(element, "element");
        String strS = JsonElementExtensionsKt.s(JsonElementKt.g(element), "transportMode", "");
        if (Intrinsics.d(strS, ChaloTransitMode.BUS.getMode())) {
            return GroupTicketLegApiModel.GroupTicketBusLegApiModel.INSTANCE.serializer();
        }
        if (Intrinsics.d(strS, ChaloTransitMode.METRO.getMode())) {
            return GroupTicketLegApiModel.GroupTicketMetroLegApiModel.INSTANCE.serializer();
        }
        throw new SerializationException("Unknown subclass");
    }
}
