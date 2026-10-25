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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/app/PBOriginDestinationAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/app/PBOriginDestinationAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PBOriginDestinationAppModel$$serializer implements GeneratedSerializer<PBOriginDestinationAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PBOriginDestinationAppModel$$serializer f7092a;
    private static final SerialDescriptor descriptor;

    static {
        PBOriginDestinationAppModel$$serializer pBOriginDestinationAppModel$$serializer = new PBOriginDestinationAppModel$$serializer();
        f7092a = pBOriginDestinationAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel", pBOriginDestinationAppModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("routeIdsWithODPair", false);
        pluginGeneratedSerialDescriptor.j("stopPairTag", true);
        pluginGeneratedSerialDescriptor.j("fromStopId", false);
        pluginGeneratedSerialDescriptor.j("fromStopName", false);
        pluginGeneratedSerialDescriptor.j("timeToReachFromStop", true);
        pluginGeneratedSerialDescriptor.j("distanceToReachFromStop", true);
        pluginGeneratedSerialDescriptor.j("modeToReachFromStop", true);
        pluginGeneratedSerialDescriptor.j("toStopId", false);
        pluginGeneratedSerialDescriptor.j("toStopName", false);
        pluginGeneratedSerialDescriptor.j("timeToReachToStop", true);
        pluginGeneratedSerialDescriptor.j("distanceToReachToStop", true);
        pluginGeneratedSerialDescriptor.j("modeToReachToStop", true);
        pluginGeneratedSerialDescriptor.j("currentPage", true);
        pluginGeneratedSerialDescriptor.j("totalPages", true);
        pluginGeneratedSerialDescriptor.j("isLastPage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PBOriginDestinationAppModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{lazyArr[0].getValue(), BuiltinSerializersKt.c(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), lazyArr[6].getValue(), stringSerializer, stringSerializer, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), lazyArr[11].getValue(), intSerializer, intSerializer, BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        PBModeToReachStopType pBModeToReachStopType;
        Long l;
        boolean zDecodeBooleanElement;
        List list;
        int i;
        Long l2;
        PBModeToReachStopType pBModeToReachStopType2;
        Long l3;
        Long l4;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBOriginDestinationAppModel.p;
        int i4 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            PBModeToReachStopType pBModeToReachStopType3 = (PBModeToReachStopType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, longSerializer, null);
            PBModeToReachStopType pBModeToReachStopType4 = (PBModeToReachStopType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            pBModeToReachStopType = pBModeToReachStopType4;
            list = list2;
            pBModeToReachStopType2 = pBModeToReachStopType3;
            str = str6;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            str4 = strDecodeStringElement3;
            l3 = l7;
            str5 = strDecodeStringElement4;
            l4 = l6;
            str3 = strDecodeStringElement2;
            l2 = l8;
            l = l5;
            i2 = iDecodeIntElement;
            i3 = iDecodeIntElement2;
            str2 = strDecodeStringElement;
            i = 32767;
        } else {
            int i5 = 14;
            boolean zDecodeBooleanElement2 = false;
            int i6 = 0;
            int iDecodeIntElement3 = 0;
            int i7 = 6;
            boolean z = true;
            PBModeToReachStopType pBModeToReachStopType5 = null;
            Long l9 = null;
            Long l10 = null;
            PBModeToReachStopType pBModeToReachStopType6 = null;
            Long l11 = null;
            Long l12 = null;
            String strDecodeStringElement5 = null;
            List list3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement4 = 0;
            String str7 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 9;
                        i7 = 6;
                        break;
                    case 0:
                        i6 |= 1;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                        i5 = 14;
                        i4 = 9;
                        i7 = 6;
                        break;
                    case 1:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str7);
                        i6 |= 2;
                        i5 = 14;
                        i4 = 9;
                        i7 = 6;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 14;
                        i4 = 9;
                        i7 = 6;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 14;
                        i4 = 9;
                        i7 = 6;
                        break;
                    case 4:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l9);
                        i6 |= 16;
                        i5 = 14;
                        i4 = 9;
                        i7 = 6;
                        break;
                    case 5:
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, l12);
                        i6 |= 32;
                        i5 = 14;
                        i4 = 9;
                        i7 = 6;
                        break;
                    case 6:
                        pBModeToReachStopType6 = (PBModeToReachStopType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i7].getValue(), pBModeToReachStopType6);
                        i6 |= 64;
                        i5 = 14;
                        i4 = 9;
                        break;
                    case 7:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 |= 128;
                        i5 = 14;
                        break;
                    case 8:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                        i5 = 14;
                        break;
                    case 9:
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.f18151a, l11);
                        i6 |= 512;
                        i5 = 14;
                        break;
                    case 10:
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.f18151a, l10);
                        i6 |= 1024;
                        i5 = 14;
                        break;
                    case 11:
                        pBModeToReachStopType5 = (PBModeToReachStopType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), pBModeToReachStopType5);
                        i6 |= 2048;
                        i5 = 14;
                        break;
                    case 12:
                        i6 |= 4096;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        break;
                    case 13:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
                        i6 |= 8192;
                        break;
                    case 14:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i6 |= 16384;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str7;
            pBModeToReachStopType = pBModeToReachStopType5;
            l = l9;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            list = list3;
            i = i6;
            l2 = l10;
            pBModeToReachStopType2 = pBModeToReachStopType6;
            l3 = l11;
            l4 = l12;
            i2 = iDecodeIntElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
            i3 = iDecodeIntElement3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PBOriginDestinationAppModel(i, list, str, str2, str3, l, l4, pBModeToReachStopType2, str4, str5, l3, l2, pBModeToReachStopType, i2, i3, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PBOriginDestinationAppModel value = (PBOriginDestinationAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBOriginDestinationAppModel.p;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        List list = value.f7091a;
        boolean z = value.o;
        int i = value.n;
        int i2 = value.m;
        PBModeToReachStopType pBModeToReachStopType = value.l;
        Long l = value.k;
        Long l2 = value.j;
        PBModeToReachStopType pBModeToReachStopType2 = value.g;
        Long l3 = value.f;
        Long l4 = value.e;
        String str = value.b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, list);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || l4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || l3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, l3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || pBModeToReachStopType2 != PBModeToReachStopType.NOT_APPLICABLE) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), pBModeToReachStopType2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || pBModeToReachStopType != PBModeToReachStopType.NOT_APPLICABLE) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (SerializationStrategy) lazyArr[11].getValue(), pBModeToReachStopType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || i2 != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 12, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || i != 1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 13, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 14, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
