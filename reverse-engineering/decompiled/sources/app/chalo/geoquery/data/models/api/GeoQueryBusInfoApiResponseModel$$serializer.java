package app.chalo.geoquery.data.models.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/geoquery/data/models/api/GeoQueryBusInfoApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryBusInfoApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GeoQueryBusInfoApiResponseModel$$serializer implements GeneratedSerializer<GeoQueryBusInfoApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeoQueryBusInfoApiResponseModel$$serializer f2808a;
    private static final SerialDescriptor descriptor;

    static {
        GeoQueryBusInfoApiResponseModel$$serializer geoQueryBusInfoApiResponseModel$$serializer = new GeoQueryBusInfoApiResponseModel$$serializer();
        f2808a = geoQueryBusInfoApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.geoquery.data.models.api.GeoQueryBusInfoApiResponseModel", geoQueryBusInfoApiResponseModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("session", false);
        pluginGeneratedSerialDescriptor.j("parameters", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(GeoQueryBusInfoSessionApiResponseModel$$serializer.f2812a), BuiltinSerializersKt.c(GeoQueryBusInfoParametersApiResponseModel$$serializer.f2810a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        GeoQueryBusInfoSessionApiResponseModel geoQueryBusInfoSessionApiResponseModel;
        GeoQueryBusInfoParametersApiResponseModel geoQueryBusInfoParametersApiResponseModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        GeoQueryBusInfoSessionApiResponseModel geoQueryBusInfoSessionApiResponseModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            geoQueryBusInfoSessionApiResponseModel = (GeoQueryBusInfoSessionApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, GeoQueryBusInfoSessionApiResponseModel$$serializer.f2812a, null);
            geoQueryBusInfoParametersApiResponseModel = (GeoQueryBusInfoParametersApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GeoQueryBusInfoParametersApiResponseModel$$serializer.f2810a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            GeoQueryBusInfoParametersApiResponseModel geoQueryBusInfoParametersApiResponseModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    geoQueryBusInfoSessionApiResponseModel2 = (GeoQueryBusInfoSessionApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, GeoQueryBusInfoSessionApiResponseModel$$serializer.f2812a, geoQueryBusInfoSessionApiResponseModel2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    geoQueryBusInfoParametersApiResponseModel2 = (GeoQueryBusInfoParametersApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GeoQueryBusInfoParametersApiResponseModel$$serializer.f2810a, geoQueryBusInfoParametersApiResponseModel2);
                    i2 |= 2;
                }
            }
            i = i2;
            geoQueryBusInfoSessionApiResponseModel = geoQueryBusInfoSessionApiResponseModel2;
            geoQueryBusInfoParametersApiResponseModel = geoQueryBusInfoParametersApiResponseModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GeoQueryBusInfoApiResponseModel(i, geoQueryBusInfoSessionApiResponseModel, geoQueryBusInfoParametersApiResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GeoQueryBusInfoApiResponseModel value = (GeoQueryBusInfoApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, GeoQueryBusInfoSessionApiResponseModel$$serializer.f2812a, value.f2807a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, GeoQueryBusInfoParametersApiResponseModel$$serializer.f2810a, value.b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
