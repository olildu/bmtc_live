package app.chalo.livetracking.routedetails.data.model.ui;

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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/routedetails/data/model/ui/TrackingAdditionalFeatures.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/routedetails/data/model/ui/TrackingAdditionalFeatures;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TrackingAdditionalFeatures$$serializer implements GeneratedSerializer<TrackingAdditionalFeatures> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TrackingAdditionalFeatures$$serializer f4424a;
    private static final SerialDescriptor descriptor;

    static {
        TrackingAdditionalFeatures$$serializer trackingAdditionalFeatures$$serializer = new TrackingAdditionalFeatures$$serializer();
        f4424a = trackingAdditionalFeatures$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures", trackingAdditionalFeatures$$serializer, 15);
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
        pluginGeneratedSerialDescriptor.j("boundMapToStartAndEndStop", true);
        pluginGeneratedSerialDescriptor.j("customStopMarkerList", true);
        pluginGeneratedSerialDescriptor.j("customStopTagList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TrackingAdditionalFeatures.p;
        LongSerializer longSerializer = LongSerializer.f18151a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue());
        KSerializer kSerializerC4 = BuiltinSerializersKt.c((KSerializer) lazyArr[13].getValue());
        KSerializer kSerializerC5 = BuiltinSerializersKt.c((KSerializer) lazyArr[14].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{booleanSerializer, booleanSerializer, kSerializerC, kSerializerC2, booleanSerializer, kSerializerC3, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, kSerializerC4, kSerializerC5};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Long l;
        Long l2;
        boolean z;
        int i;
        List list;
        List list2;
        List list3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TrackingAdditionalFeatures.p;
        int i3 = 10;
        int i4 = 9;
        int i5 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), null);
            i = 32767;
            z3 = zDecodeBooleanElement10;
            z4 = zDecodeBooleanElement8;
            z5 = zDecodeBooleanElement7;
            z6 = zDecodeBooleanElement5;
            z7 = zDecodeBooleanElement4;
            l = l4;
            z8 = zDecodeBooleanElement6;
            z9 = zDecodeBooleanElement3;
            l2 = l3;
            list3 = list4;
            z2 = zDecodeBooleanElement2;
            z = zDecodeBooleanElement;
            z10 = zDecodeBooleanElement9;
        } else {
            int i6 = 14;
            boolean z11 = true;
            int i7 = 0;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            boolean zDecodeBooleanElement17 = false;
            boolean zDecodeBooleanElement18 = false;
            boolean zDecodeBooleanElement19 = false;
            Long l5 = null;
            List list5 = null;
            List list6 = null;
            List list7 = null;
            boolean zDecodeBooleanElement20 = false;
            Long l6 = null;
            while (z11) {
                int i8 = i5;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i3 = 10;
                        i5 = 5;
                        break;
                    case 0:
                        i7 |= 1;
                        zDecodeBooleanElement20 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i3 = 10;
                        i4 = 9;
                        i5 = 5;
                        i6 = 14;
                        break;
                    case 1:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i7 |= 2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 5;
                        i6 = 14;
                        break;
                    case 2:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l6);
                        i7 |= 4;
                        i3 = 10;
                        i4 = 9;
                        i5 = 5;
                        i6 = 14;
                        break;
                    case 3:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l5);
                        i7 |= 8;
                        i3 = 10;
                        i4 = 9;
                        i5 = 5;
                        i6 = 14;
                        break;
                    case 4:
                        i2 = i8;
                        zDecodeBooleanElement18 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i7 |= 16;
                        i5 = i2;
                        i3 = 10;
                        i4 = 9;
                        i6 = 14;
                        break;
                    case 5:
                        i2 = i8;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i8].getValue(), list7);
                        i7 |= 32;
                        i5 = i2;
                        i3 = 10;
                        i4 = 9;
                        i6 = 14;
                        break;
                    case 6:
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i7 |= 64;
                        i5 = i8;
                        i6 = 14;
                        break;
                    case 7:
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i7 |= 128;
                        i5 = i8;
                        i6 = 14;
                        break;
                    case 8:
                        zDecodeBooleanElement17 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i7 |= 256;
                        i5 = i8;
                        i6 = 14;
                        break;
                    case 9:
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i7 |= 512;
                        i5 = i8;
                        i6 = 14;
                        break;
                    case 10:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i7 |= 1024;
                        i5 = i8;
                        i6 = 14;
                        break;
                    case 11:
                        zDecodeBooleanElement19 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i7 |= 2048;
                        i5 = i8;
                        i6 = 14;
                        break;
                    case 12:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i7 |= 4096;
                        i5 = i8;
                        i6 = 14;
                        break;
                    case 13:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list5);
                        i7 |= 8192;
                        i5 = i8;
                        i6 = 14;
                        break;
                    case 14:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), list6);
                        i7 |= 16384;
                        i5 = i8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            l = l5;
            l2 = l6;
            z = zDecodeBooleanElement20;
            i = i7;
            list = list5;
            list2 = list6;
            list3 = list7;
            z2 = zDecodeBooleanElement11;
            z3 = zDecodeBooleanElement12;
            z4 = zDecodeBooleanElement13;
            z5 = zDecodeBooleanElement14;
            z6 = zDecodeBooleanElement15;
            z7 = zDecodeBooleanElement16;
            z8 = zDecodeBooleanElement17;
            z9 = zDecodeBooleanElement18;
            z10 = zDecodeBooleanElement19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TrackingAdditionalFeatures(i, z, z2, l2, l, z9, list3, z7, z6, z8, z5, z4, z10, z3, list, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TrackingAdditionalFeatures value = (TrackingAdditionalFeatures) obj;
        Intrinsics.i(value, "value");
        List list = value.o;
        List list2 = value.n;
        boolean z = value.m;
        boolean z2 = value.l;
        boolean z3 = value.k;
        boolean z4 = value.j;
        boolean z5 = value.i;
        boolean z6 = value.h;
        boolean z7 = value.g;
        List list3 = value.f;
        boolean z8 = value.e;
        Long l = value.d;
        Long l2 = value.c;
        boolean z9 = value.b;
        boolean z10 = value.f4423a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TrackingAdditionalFeatures.p;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || z10) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z9) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !z8) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || list3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !z7) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || z6) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || !z5) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || !z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || !z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 11, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 12, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
