package app.chalo.ncmc.deserializer;

import androidx.media3.extractor.text.ttml.TtmlNode;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.ncmc.data.apiresponsemodel.CardsTypeInfoApiResponse;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/ncmc/deserializer/ChaloCardsInfoDeserializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardsInfoDeserializer extends JsonContentPolymorphicSerializer<CardsTypeInfoApiResponse> {
    public static final ChaloCardsInfoDeserializer c = new ChaloCardsInfoDeserializer(Reflection.a(CardsTypeInfoApiResponse.class));

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public final DeserializationStrategy a(JsonElement element) {
        Intrinsics.i(element, "element");
        String strS = JsonElementExtensionsKt.s(JsonElementKt.g(element), "cardType", "");
        if (StringsKt.x(strS, "semiclosed", true)) {
            return CardsTypeInfoApiResponse.SemiClosed.INSTANCE.serializer();
        }
        if (StringsKt.x(strS, "closed", true)) {
            return CardsTypeInfoApiResponse.Closed.INSTANCE.serializer();
        }
        return StringsKt.x(strS, TtmlNode.TEXT_EMPHASIS_MARK_OPEN, true) ? CardsTypeInfoApiResponse.Open.INSTANCE.serializer() : CardsTypeInfoApiResponse.Unknown.INSTANCE.serializer();
    }
}
