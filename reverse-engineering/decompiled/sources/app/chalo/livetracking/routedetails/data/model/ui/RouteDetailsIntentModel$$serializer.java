package app.chalo.livetracking.routedetails.data.model.ui;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/routedetails/data/model/ui/RouteDetailsIntentModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsIntentModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteDetailsIntentModel$$serializer implements GeneratedSerializer<RouteDetailsIntentModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteDetailsIntentModel$$serializer f4406a;
    private static final SerialDescriptor descriptor;

    static {
        RouteDetailsIntentModel$$serializer routeDetailsIntentModel$$serializer = new RouteDetailsIntentModel$$serializer();
        f4406a = routeDetailsIntentModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel", routeDetailsIntentModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("startStopId", true);
        pluginGeneratedSerialDescriptor.j("endStopId", true);
        pluginGeneratedSerialDescriptor.j("triggerStopId", true);
        pluginGeneratedSerialDescriptor.j("origin", false);
        pluginGeneratedSerialDescriptor.j("isBoardingStopBasedOnLocation", true);
        pluginGeneratedSerialDescriptor.j("premiumBusTrackingFlow", true);
        pluginGeneratedSerialDescriptor.j("additionalFeatures", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, kSerializerC, kSerializerC2, kSerializerC3, stringSerializer, BuiltinSerializersKt.c(booleanSerializer), booleanSerializer, TrackingAdditionalFeatures$$serializer.f4424a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        Boolean bool;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            str = strDecodeStringElement;
            trackingAdditionalFeatures = (TrackingAdditionalFeatures) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, TrackingAdditionalFeatures$$serializer.f4424a, null);
            z = zDecodeBooleanElement;
            bool = bool2;
            str4 = str8;
            str5 = strDecodeStringElement2;
            str3 = str7;
            str2 = str6;
            i = 255;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            TrackingAdditionalFeatures trackingAdditionalFeatures2 = null;
            String strDecodeStringElement3 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement4 = null;
            int i3 = 0;
            Boolean bool3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str9);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str10);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str11);
                        i3 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool3);
                        i3 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        trackingAdditionalFeatures2 = (TrackingAdditionalFeatures) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, TrackingAdditionalFeatures$$serializer.f4424a, trackingAdditionalFeatures2);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            trackingAdditionalFeatures = trackingAdditionalFeatures2;
            bool = bool3;
            i = i3;
            str = strDecodeStringElement3;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RouteDetailsIntentModel(i, str, str2, str3, str4, str5, bool, z, trackingAdditionalFeatures);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteDetailsIntentModel value = (RouteDetailsIntentModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f4405a;
        TrackingAdditionalFeatures trackingAdditionalFeatures = value.h;
        boolean z = value.g;
        Boolean bool = value.f;
        String str2 = value.d;
        String str3 = value.c;
        String str4 = value.b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.d(trackingAdditionalFeatures, new TrackingAdditionalFeatures(32767, null, null, null))) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, TrackingAdditionalFeatures$$serializer.f4424a, trackingAdditionalFeatures);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
