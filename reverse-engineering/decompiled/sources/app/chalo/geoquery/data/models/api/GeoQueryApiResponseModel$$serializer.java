package app.chalo.geoquery.data.models.api;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/geoquery/data/models/api/GeoQueryApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GeoQueryApiResponseModel$$serializer implements GeneratedSerializer<GeoQueryApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeoQueryApiResponseModel$$serializer f2806a;
    private static final SerialDescriptor descriptor;

    static {
        GeoQueryApiResponseModel$$serializer geoQueryApiResponseModel$$serializer = new GeoQueryApiResponseModel$$serializer();
        f2806a = geoQueryApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.geoquery.data.models.api.GeoQueryApiResponseModel", geoQueryApiResponseModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("buses", false);
        pluginGeneratedSerialDescriptor.j("reportProblemData", false);
        pluginGeneratedSerialDescriptor.j("cityInfo", true);
        pluginGeneratedSerialDescriptor.j("cardsInfo", true);
        pluginGeneratedSerialDescriptor.j("bannerInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) GeoQueryApiResponseModel.f[0].getValue());
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f18193a;
        return new KSerializer[]{kSerializerC, BuiltinSerializersKt.c(jsonElementSerializer), BuiltinSerializersKt.c(jsonElementSerializer), BuiltinSerializersKt.c(jsonElementSerializer), BuiltinSerializersKt.c(jsonElementSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GeoQueryApiResponseModel.f;
        int i2 = 0;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f18193a;
            JsonElement jsonElement5 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, jsonElementSerializer, null);
            JsonElement jsonElement6 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, jsonElementSerializer, null);
            JsonElement jsonElement7 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, jsonElementSerializer, null);
            list = list3;
            jsonElement4 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, jsonElementSerializer, null);
            jsonElement3 = jsonElement7;
            i = 31;
            jsonElement2 = jsonElement6;
            jsonElement = jsonElement5;
        } else {
            int i3 = 1;
            int i4 = 0;
            JsonElement jsonElement8 = null;
            JsonElement jsonElement9 = null;
            JsonElement jsonElement10 = null;
            JsonElement jsonElement11 = null;
            while (i3 != 0) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                int i5 = i2;
                if (iDecodeElementIndex == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        jsonElement8 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonElementSerializer.f18193a, jsonElement8);
                        i4 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        jsonElement9 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, JsonElementSerializer.f18193a, jsonElement9);
                        i4 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        jsonElement10 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, JsonElementSerializer.f18193a, jsonElement10);
                        i4 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        jsonElement11 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, JsonElementSerializer.f18193a, jsonElement11);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list2);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            list = list2;
            jsonElement = jsonElement8;
            jsonElement2 = jsonElement9;
            jsonElement3 = jsonElement10;
            jsonElement4 = jsonElement11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GeoQueryApiResponseModel(i, list, jsonElement, jsonElement2, jsonElement3, jsonElement4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GeoQueryApiResponseModel value = (GeoQueryApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializationStrategy serializationStrategy = (SerializationStrategy) GeoQueryApiResponseModel.f[0].getValue();
        List list = value.f2805a;
        JsonElement jsonElement = value.e;
        JsonElement jsonElement2 = value.d;
        JsonElement jsonElement3 = value.c;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, serializationStrategy, list);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f18193a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, jsonElementSerializer, value.b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || jsonElement3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, jsonElementSerializer, jsonElement3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || jsonElement2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, jsonElementSerializer, jsonElement2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || jsonElement != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, jsonElementSerializer, jsonElement);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
