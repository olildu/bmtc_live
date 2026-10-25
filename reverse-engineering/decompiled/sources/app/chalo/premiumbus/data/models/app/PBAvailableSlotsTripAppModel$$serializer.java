package app.chalo.premiumbus.data.models.app;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/app/PBAvailableSlotsTripAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/app/PBAvailableSlotsTripAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PBAvailableSlotsTripAppModel$$serializer implements GeneratedSerializer<PBAvailableSlotsTripAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PBAvailableSlotsTripAppModel$$serializer f7090a;
    private static final SerialDescriptor descriptor;

    static {
        PBAvailableSlotsTripAppModel$$serializer pBAvailableSlotsTripAppModel$$serializer = new PBAvailableSlotsTripAppModel$$serializer();
        f7090a = pBAvailableSlotsTripAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel", pBAvailableSlotsTripAppModel$$serializer, 18);
        pluginGeneratedSerialDescriptor.j("tripUniqueId", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("fromStopId", false);
        pluginGeneratedSerialDescriptor.j("toStopId", false);
        pluginGeneratedSerialDescriptor.j("tripId", false);
        pluginGeneratedSerialDescriptor.j("fromStopTime", false);
        pluginGeneratedSerialDescriptor.j("toStopTime", false);
        pluginGeneratedSerialDescriptor.j("vehicleCapacity", false);
        pluginGeneratedSerialDescriptor.j("availableSeats", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("slotStatus", false);
        pluginGeneratedSerialDescriptor.j("originalFromStopTime", false);
        pluginGeneratedSerialDescriptor.j("slotArrivalStatus", false);
        pluginGeneratedSerialDescriptor.j("vehicleNumber", false);
        pluginGeneratedSerialDescriptor.j("seatAssignmentType", false);
        pluginGeneratedSerialDescriptor.j("applicableRules", false);
        pluginGeneratedSerialDescriptor.j("multiSeatAllowed", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PBAvailableSlotsTripAppModel.s;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, longSerializer, longSerializer, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), lazyArr[10].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[11].getValue()), BuiltinSerializersKt.c(longSerializer), lazyArr[13].getValue(), BuiltinSerializersKt.c(stringSerializer), lazyArr[15].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[16].getValue()), BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        boolean zDecodeBooleanElement;
        Integer num;
        Integer num2;
        PremiumBusSeatAssignmentType premiumBusSeatAssignmentType;
        String str;
        PremiumBusSlotArrivalStatus premiumBusSlotArrivalStatus;
        PremiumBusSlotStatusType premiumBusSlotStatusType;
        List list;
        Long l;
        List list2;
        long j;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBAvailableSlotsTripAppModel.s;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, intSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            PremiumBusSlotStatusType premiumBusSlotStatusType2 = (PremiumBusSlotStatusType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.f18151a, null);
            PremiumBusSlotArrivalStatus premiumBusSlotArrivalStatus2 = (PremiumBusSlotArrivalStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, null);
            PremiumBusSeatAssignmentType premiumBusSeatAssignmentType2 = (PremiumBusSeatAssignmentType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), null);
            i = 262143;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), null);
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement2;
            list2 = list3;
            str4 = strDecodeStringElement3;
            num = num4;
            j = jDecodeLongElement2;
            str7 = strDecodeStringElement6;
            str5 = strDecodeStringElement4;
            num2 = num3;
            str6 = strDecodeStringElement5;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
            premiumBusSeatAssignmentType = premiumBusSeatAssignmentType2;
            str = str8;
            premiumBusSlotArrivalStatus = premiumBusSlotArrivalStatus2;
            l = l2;
            premiumBusSlotStatusType = premiumBusSlotStatusType2;
            j2 = jDecodeLongElement;
        } else {
            int i2 = 17;
            long jDecodeLongElement3 = 0;
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            Integer num5 = null;
            PremiumBusSeatAssignmentType premiumBusSeatAssignmentType3 = null;
            String str9 = null;
            PremiumBusSlotArrivalStatus premiumBusSlotArrivalStatus3 = null;
            PremiumBusSlotStatusType premiumBusSlotStatusType3 = null;
            List list4 = null;
            Long l3 = null;
            List list5 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            long jDecodeLongElement4 = 0;
            i = 0;
            Integer num6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 17;
                        break;
                    case 0:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i2 = 17;
                        break;
                    case 1:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i2 = 17;
                        break;
                    case 2:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i2 = 17;
                        break;
                    case 3:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        i2 = 17;
                        break;
                    case 4:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        i2 = 17;
                        break;
                    case 5:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        i2 = 17;
                        break;
                    case 6:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i |= 64;
                        i2 = 17;
                        break;
                    case 7:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i |= 128;
                        i2 = 17;
                        break;
                    case 8:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.f18146a, num6);
                        i |= 256;
                        i2 = 17;
                        break;
                    case 9:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.f18146a, num5);
                        i |= 512;
                        i2 = 17;
                        break;
                    case 10:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), list5);
                        i |= 1024;
                        i2 = 17;
                        break;
                    case 11:
                        premiumBusSlotStatusType3 = (PremiumBusSlotStatusType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), premiumBusSlotStatusType3);
                        i |= 2048;
                        i2 = 17;
                        break;
                    case 12:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.f18151a, l3);
                        i |= 4096;
                        i2 = 17;
                        break;
                    case 13:
                        premiumBusSlotArrivalStatus3 = (PremiumBusSlotArrivalStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), premiumBusSlotArrivalStatus3);
                        i |= 8192;
                        i2 = 17;
                        break;
                    case 14:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str9);
                        i |= 16384;
                        i2 = 17;
                        break;
                    case 15:
                        premiumBusSeatAssignmentType3 = (PremiumBusSeatAssignmentType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), premiumBusSeatAssignmentType3);
                        i |= 32768;
                        i2 = 17;
                        break;
                    case 16:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), list4);
                        i |= 65536;
                        i2 = 17;
                        break;
                    case 17:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i |= 131072;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            num = num5;
            num2 = num6;
            premiumBusSeatAssignmentType = premiumBusSeatAssignmentType3;
            str = str9;
            premiumBusSlotArrivalStatus = premiumBusSlotArrivalStatus3;
            premiumBusSlotStatusType = premiumBusSlotStatusType3;
            list = list4;
            l = l3;
            list2 = list5;
            j = jDecodeLongElement3;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            str6 = strDecodeStringElement11;
            str7 = strDecodeStringElement12;
            j2 = jDecodeLongElement4;
        }
        int i3 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PBAvailableSlotsTripAppModel(i3, str2, str3, str4, str5, str6, str7, j2, j, num2, num, list2, premiumBusSlotStatusType, l, premiumBusSlotArrivalStatus, str, premiumBusSeatAssignmentType, list, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PBAvailableSlotsTripAppModel value = (PBAvailableSlotsTripAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBAvailableSlotsTripAppModel.s;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f7089a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, value.h);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, intSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, intSerializer, value.j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (SerializationStrategy) lazyArr[11].getValue(), value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.f18151a, value.m);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, value.o);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), value.p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, (SerializationStrategy) lazyArr[16].getValue(), value.q);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 17, value.r);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
