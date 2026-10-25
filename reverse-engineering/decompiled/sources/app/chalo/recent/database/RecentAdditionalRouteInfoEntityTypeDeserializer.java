package app.chalo.recent.database;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/recent/database/RecentAdditionalRouteInfoEntityTypeDeserializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentAdditionalRouteInfoEntityTypeDeserializer extends JsonContentPolymorphicSerializer<RecentAdditionalRouteInfoEntity> {
    public static final RecentAdditionalRouteInfoEntityTypeDeserializer c = new RecentAdditionalRouteInfoEntityTypeDeserializer(Reflection.a(RecentAdditionalRouteInfoEntity.class));

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public final DeserializationStrategy a(JsonElement element) {
        Intrinsics.i(element, "element");
        String strS = JsonElementExtensionsKt.s(JsonElementKt.g(element), "mode", "");
        if (StringsKt.x(strS, "bus", true)) {
            return RecentAdditionalRouteInfoEntity.Bus.INSTANCE.serializer();
        }
        return StringsKt.x(strS, "metro", true) ? RecentAdditionalRouteInfoEntity.Metro.INSTANCE.serializer() : RecentAdditionalRouteInfoEntity.Bus.INSTANCE.serializer();
    }
}
