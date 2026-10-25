package app.chalo.geoquery.data.models.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/geoquery/data/models/api/GeoQueryApiRequestModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GeoQueryApiRequestModel$$serializer implements GeneratedSerializer<GeoQueryApiRequestModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeoQueryApiRequestModel$$serializer f2798a;
    private static final SerialDescriptor descriptor;

    static {
        GeoQueryApiRequestModel$$serializer geoQueryApiRequestModel$$serializer = new GeoQueryApiRequestModel$$serializer();
        f2798a = geoQueryApiRequestModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.geoquery.data.models.api.GeoQueryApiRequestModel", geoQueryApiRequestModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("metaData", false);
        pluginGeneratedSerialDescriptor.j("requiredFields", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{GeoQueryApiRequestMetaData$$serializer.f2796a, GeoQueryApiRequestRequiredFields$$serializer.f2804a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        GeoQueryApiRequestMetaData geoQueryApiRequestMetaData;
        GeoQueryApiRequestRequiredFields geoQueryApiRequestRequiredFields;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        GeoQueryApiRequestMetaData geoQueryApiRequestMetaData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            geoQueryApiRequestMetaData = (GeoQueryApiRequestMetaData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, GeoQueryApiRequestMetaData$$serializer.f2796a, null);
            geoQueryApiRequestRequiredFields = (GeoQueryApiRequestRequiredFields) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, GeoQueryApiRequestRequiredFields$$serializer.f2804a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            GeoQueryApiRequestRequiredFields geoQueryApiRequestRequiredFields2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    geoQueryApiRequestMetaData2 = (GeoQueryApiRequestMetaData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, GeoQueryApiRequestMetaData$$serializer.f2796a, geoQueryApiRequestMetaData2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    geoQueryApiRequestRequiredFields2 = (GeoQueryApiRequestRequiredFields) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, GeoQueryApiRequestRequiredFields$$serializer.f2804a, geoQueryApiRequestRequiredFields2);
                    i2 |= 2;
                }
            }
            i = i2;
            geoQueryApiRequestMetaData = geoQueryApiRequestMetaData2;
            geoQueryApiRequestRequiredFields = geoQueryApiRequestRequiredFields2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GeoQueryApiRequestModel(i, geoQueryApiRequestMetaData, geoQueryApiRequestRequiredFields);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GeoQueryApiRequestModel value = (GeoQueryApiRequestModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, GeoQueryApiRequestMetaData$$serializer.f2796a, value.f2797a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, GeoQueryApiRequestRequiredFields$$serializer.f2804a, value.b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
