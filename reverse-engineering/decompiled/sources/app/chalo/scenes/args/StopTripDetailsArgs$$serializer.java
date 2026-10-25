package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngSerializer;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/StopTripDetailsArgs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/StopTripDetailsArgs;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class StopTripDetailsArgs$$serializer implements GeneratedSerializer<StopTripDetailsArgs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StopTripDetailsArgs$$serializer f9309a;
    private static final SerialDescriptor descriptor;

    static {
        StopTripDetailsArgs$$serializer stopTripDetailsArgs$$serializer = new StopTripDetailsArgs$$serializer();
        f9309a = stopTripDetailsArgs$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.StopTripDetailsArgs", stopTripDetailsArgs$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("stopId", false);
        pluginGeneratedSerialDescriptor.j("stopName", false);
        pluginGeneratedSerialDescriptor.j("stopLocation", false);
        pluginGeneratedSerialDescriptor.j("mode", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("distKm", false);
        pluginGeneratedSerialDescriptor.j("cityName", false);
        pluginGeneratedSerialDescriptor.j("tag", false);
        pluginGeneratedSerialDescriptor.j("sourceString", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = StopTripDetailsArgs.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.c(LatLngSerializer.f5136a), lazyArr[3].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue()), BuiltinSerializersKt.c(DoubleSerializer.f18137a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Double d;
        String str;
        String str2;
        Source source;
        ChaloTransitMode chaloTransitMode;
        String str3;
        String str4;
        LatLng latLng;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = StopTripDetailsArgs.k;
        int i2 = 7;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            LatLng latLng2 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LatLngSerializer.f5136a, null);
            ChaloTransitMode chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            Source source2 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            Double d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.f18137a, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            source = source2;
            str3 = strDecodeStringElement3;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str = str5;
            d = d2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            latLng = latLng2;
            chaloTransitMode = chaloTransitMode2;
            i = 511;
            str4 = strDecodeStringElement4;
        } else {
            int i3 = 3;
            int i4 = 4;
            boolean z = true;
            int i5 = 0;
            Double d3 = null;
            String str6 = null;
            String str7 = null;
            Source source3 = null;
            ChaloTransitMode chaloTransitMode3 = null;
            String strDecodeStringElement5 = null;
            LatLng latLng3 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 3;
                        i4 = 4;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 7;
                        i3 = 3;
                        i4 = 4;
                        break;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 3;
                        i4 = 4;
                        break;
                    case 2:
                        latLng3 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LatLngSerializer.f5136a, latLng3);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 3;
                        i4 = 4;
                        break;
                    case 3:
                        chaloTransitMode3 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), chaloTransitMode3);
                        i5 |= 8;
                        i2 = 7;
                        i4 = 4;
                        break;
                    case 4:
                        source3 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), source3);
                        i5 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.f18137a, d3);
                        i5 |= 32;
                        i2 = 7;
                        break;
                    case 6:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str6);
                        i5 |= 64;
                        break;
                    case 7:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str7);
                        i5 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            d = d3;
            str = str6;
            str2 = str7;
            source = source3;
            chaloTransitMode = chaloTransitMode3;
            str3 = strDecodeStringElement2;
            str4 = strDecodeStringElement5;
            latLng = latLng3;
            strDecodeStringElement = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StopTripDetailsArgs(i, str3, str4, latLng, chaloTransitMode, source, d, str, str2, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        StopTripDetailsArgs value = (StopTripDetailsArgs) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = StopTripDetailsArgs.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LatLngSerializer.f5136a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.f18137a, value.g);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
