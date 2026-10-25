package app.chalo.deeplink;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/deeplink/DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/deeplink/DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$$serializer implements GeneratedSerializer<DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$$serializer f2457a;
    private static final SerialDescriptor descriptor;

    static {
        DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$$serializer deepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$$serializer = new DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$$serializer();
        f2457a = deepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.deeplink.DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload", deepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("handleBusPassedStop", true);
        pluginGeneratedSerialDescriptor.j("handleLiveTrackingNotAvailable", true);
        pluginGeneratedSerialDescriptor.j("scheduledTimeForStartStop", true);
        pluginGeneratedSerialDescriptor.j("scheduledTimeForTripStart", true);
        pluginGeneratedSerialDescriptor.j("showTimetableButton", true);
        pluginGeneratedSerialDescriptor.j("vehicleNumbersToTrack", true);
        pluginGeneratedSerialDescriptor.j("showRouteBookingType", true);
        pluginGeneratedSerialDescriptor.j("preSelectStartStopForShowingEtaOnMap", true);
        pluginGeneratedSerialDescriptor.j("showMyLocationButtonOnMap", true);
        pluginGeneratedSerialDescriptor.j("showNextBusHeadingForEta", true);
        pluginGeneratedSerialDescriptor.j("showBusIconForEta", true);
        pluginGeneratedSerialDescriptor.j("showNearestStopTagForTriggerStop", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload.m;
        LongSerializer longSerializer = LongSerializer.f18151a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{booleanSerializer, booleanSerializer, kSerializerC, kSerializerC2, booleanSerializer, kSerializerC3, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        int i;
        List list;
        Long l;
        Long l2;
        boolean z2;
        boolean zDecodeBooleanElement;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zDecodeBooleanElement2;
        boolean z6;
        boolean z7;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload.m;
        int i2 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            list = list2;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement6;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            z3 = zDecodeBooleanElement9;
            z4 = zDecodeBooleanElement7;
            z5 = zDecodeBooleanElement8;
            l = l4;
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            z6 = zDecodeBooleanElement5;
            l2 = l3;
            i = 4095;
            z7 = zDecodeBooleanElement4;
        } else {
            int i3 = 11;
            List list3 = null;
            boolean z8 = true;
            int i4 = 0;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            boolean zDecodeBooleanElement17 = false;
            Long l5 = null;
            Long l6 = null;
            boolean zDecodeBooleanElement18 = false;
            while (z8) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z8 = false;
                        i3 = 11;
                        break;
                    case 0:
                        i4 |= 1;
                        zDecodeBooleanElement18 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i3 = 11;
                        i2 = 10;
                        break;
                    case 1:
                        zDecodeBooleanElement17 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 11;
                        i2 = 10;
                        break;
                    case 2:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l6);
                        i4 |= 4;
                        i3 = 11;
                        i2 = 10;
                        break;
                    case 3:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l5);
                        i4 |= 8;
                        i3 = 11;
                        i2 = 10;
                        break;
                    case 4:
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list3);
                        i4 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i4 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i4 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i4 |= 256;
                        break;
                    case 9:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i4 |= 512;
                        break;
                    case 10:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i4 |= 1024;
                        break;
                    case 11:
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i4 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement18;
            i = i4;
            list = list3;
            l = l5;
            l2 = l6;
            z2 = zDecodeBooleanElement10;
            zDecodeBooleanElement = zDecodeBooleanElement11;
            z3 = zDecodeBooleanElement12;
            z4 = zDecodeBooleanElement13;
            z5 = zDecodeBooleanElement14;
            zDecodeBooleanElement2 = zDecodeBooleanElement15;
            z6 = zDecodeBooleanElement16;
            z7 = zDecodeBooleanElement17;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload(i, z, z7, l2, l, z6, list, z2, z4, z5, z3, zDecodeBooleanElement, zDecodeBooleanElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload value = (DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload) obj;
        Intrinsics.i(value, "value");
        boolean z = value.l;
        boolean z2 = value.k;
        boolean z3 = value.j;
        boolean z4 = value.i;
        boolean z5 = value.h;
        boolean z6 = value.g;
        List list = value.f;
        boolean z7 = value.e;
        Long l = value.d;
        Long l2 = value.c;
        boolean z8 = value.b;
        boolean z9 = value.f2456a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload.m;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || z9) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z8) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !z7) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !z6) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || z5) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || !z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || !z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || !z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 11, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
