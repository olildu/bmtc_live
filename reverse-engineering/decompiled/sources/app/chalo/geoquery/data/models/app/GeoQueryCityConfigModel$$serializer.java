package app.chalo.geoquery.data.models.app;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/geoquery/data/models/app/GeoQueryCityConfigModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/geoquery/data/models/app/GeoQueryCityConfigModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GeoQueryCityConfigModel$$serializer implements GeneratedSerializer<GeoQueryCityConfigModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeoQueryCityConfigModel$$serializer f2817a;
    private static final SerialDescriptor descriptor;

    static {
        GeoQueryCityConfigModel$$serializer geoQueryCityConfigModel$$serializer = new GeoQueryCityConfigModel$$serializer();
        f2817a = geoQueryCityConfigModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel", geoQueryCityConfigModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("city", true);
        pluginGeneratedSerialDescriptor.j("mapOverlayRadius", true);
        pluginGeneratedSerialDescriptor.j("newQueryThreshold", true);
        pluginGeneratedSerialDescriptor.j("mapZoomLevel", true);
        pluginGeneratedSerialDescriptor.j("initialPollingDelay", true);
        pluginGeneratedSerialDescriptor.j("pollingDelayStepCount", true);
        pluginGeneratedSerialDescriptor.j("initialRequestBurst", true);
        pluginGeneratedSerialDescriptor.j("burstRequestAllowedCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.f18146a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{StringSerializer.f18170a, intSerializer, intSerializer, intSerializer, longSerializer, longSerializer, longSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            j = jDecodeLongElement3;
            i = iDecodeIntElement4;
            i2 = 255;
            i3 = iDecodeIntElement3;
            i4 = iDecodeIntElement2;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
        } else {
            strDecodeStringElement = null;
            boolean z = true;
            int iDecodeIntElement5 = 0;
            int i5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            int iDecodeIntElement8 = 0;
            long jDecodeLongElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        continue;
                    case 1:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i5 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i5 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement8;
            j = jDecodeLongElement6;
            i = iDecodeIntElement5;
            i2 = i5;
            i3 = iDecodeIntElement6;
            i4 = iDecodeIntElement7;
            j2 = jDecodeLongElement4;
            j3 = jDecodeLongElement5;
        }
        String str = strDecodeStringElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GeoQueryCityConfigModel(i2, str, i4, i3, i, j2, j3, j, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GeoQueryCityConfigModel value = (GeoQueryCityConfigModel) obj;
        Intrinsics.i(value, "value");
        int i = value.h;
        long j = value.g;
        long j2 = value.f;
        long j3 = value.e;
        int i2 = value.d;
        int i3 = value.c;
        int i4 = value.b;
        String str = value.f2816a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || i4 != 1000) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, i4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || i3 != 500) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || i2 != 15) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j3 != 9000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || j2 != 1000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || j != 5000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || i != 2) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, i);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
