package app.chalo.productpurchase.productselection.data.models.app;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigFareMappingResponseAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigFareMappingResponseAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassProductConfigFareMappingResponseAppModel$$serializer implements GeneratedSerializer<SuperPassProductConfigFareMappingResponseAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassProductConfigFareMappingResponseAppModel$$serializer f8643a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassProductConfigFareMappingResponseAppModel$$serializer superPassProductConfigFareMappingResponseAppModel$$serializer = new SuperPassProductConfigFareMappingResponseAppModel$$serializer();
        f8643a = superPassProductConfigFareMappingResponseAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel", superPassProductConfigFareMappingResponseAppModel$$serializer, 21);
        pluginGeneratedSerialDescriptor.j("desc", false);
        pluginGeneratedSerialDescriptor.j("fmId", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("subCatId", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("durationId", false);
        pluginGeneratedSerialDescriptor.j("numOfTrips", true);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("isRenewable", false);
        pluginGeneratedSerialDescriptor.j("verification", false);
        pluginGeneratedSerialDescriptor.j("maxTripsPerDay", true);
        pluginGeneratedSerialDescriptor.j("maxPricePerTrip", true);
        pluginGeneratedSerialDescriptor.j("isProofRequired", true);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("dInfo", false);
        pluginGeneratedSerialDescriptor.j("proofs", true);
        pluginGeneratedSerialDescriptor.j("inactiveReason", false);
        pluginGeneratedSerialDescriptor.j("durationInfo", false);
        pluginGeneratedSerialDescriptor.j("tags", false);
        pluginGeneratedSerialDescriptor.j("applicableRules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassProductConfigFareMappingResponseAppModel.v;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), intSerializer, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), booleanSerializer, LongSerializer.f18151a, intSerializer, stringSerializer, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), intSerializer, DoubleSerializer.f18137a, booleanSerializer, lazyArr[13].getValue(), SuperPassProductFareInfoResponseAppModel$$serializer.f8647a, BuiltinSerializersKt.c(stringSerializer), lazyArr[16].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[19].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[20].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        List list;
        Boolean bool;
        String str3;
        List list2;
        Boolean bool2;
        String str4;
        List list3;
        String str5;
        SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel;
        Boolean bool3;
        int i;
        String str6;
        List list4;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        double d;
        long j;
        int i5;
        int i6;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassProductConfigFareMappingResponseAppModel.v;
        List list5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel2 = (SuperPassProductFareInfoResponseAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, SuperPassProductFareInfoResponseAppModel$$serializer.f8647a, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (DeserializationStrategy) lazyArr[19].getValue(), null);
            str4 = str9;
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), null);
            i = 2097151;
            z = zDecodeBooleanElement;
            bool2 = bool4;
            i2 = iDecodeIntElement;
            bool3 = bool6;
            i3 = iDecodeIntElement3;
            str6 = strDecodeStringElement;
            i4 = iDecodeIntElement2;
            z2 = zDecodeBooleanElement2;
            str3 = str7;
            list3 = list7;
            str5 = str8;
            superPassProductFareInfoResponseAppModel = superPassProductFareInfoResponseAppModel2;
            list4 = list8;
            list = list6;
            bool = bool5;
            d = dDecodeDoubleElement;
            j = jDecodeLongElement;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z3 = true;
            int i7 = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement4 = false;
            List list9 = null;
            str = null;
            List list10 = null;
            Boolean bool7 = null;
            String str10 = null;
            Boolean bool8 = null;
            String str11 = null;
            String str12 = null;
            List list11 = null;
            String str13 = null;
            SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel3 = null;
            Boolean bool9 = null;
            String strDecodeStringElement2 = null;
            double dDecodeDoubleElement2 = 0.0d;
            while (z3) {
                String str14 = str11;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str14;
                        bool8 = bool8;
                        z3 = false;
                        i7 = i7;
                        list9 = list9;
                        break;
                    case 0:
                        i7 |= 1;
                        bool8 = bool8;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str14);
                        list9 = list9;
                        break;
                    case 1:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i7 |= 2;
                        bool8 = bool8;
                        list9 = list9;
                        str11 = str14;
                        break;
                    case 2:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.f18123a, bool8);
                        i7 |= 4;
                        list9 = list9;
                        str11 = str14;
                        break;
                    case 3:
                        bool8 = bool8;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str10);
                        i7 |= 8;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 4:
                        bool8 = bool8;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i7 |= 16;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 5:
                        bool8 = bool8;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i7 |= 32;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 6:
                        bool8 = bool8;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i7 |= 64;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 7:
                        bool8 = bool8;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 8:
                        bool8 = bool8;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool7);
                        i7 |= 256;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 9:
                        bool8 = bool8;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.f18123a, bool9);
                        i7 |= 512;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 10:
                        bool8 = bool8;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i7 |= 1024;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 11:
                        bool8 = bool8;
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 11);
                        i7 |= 2048;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 12:
                        bool8 = bool8;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i7 |= 4096;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 13:
                        bool8 = bool8;
                        list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list10);
                        i7 |= 8192;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 14:
                        bool8 = bool8;
                        superPassProductFareInfoResponseAppModel3 = (SuperPassProductFareInfoResponseAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, SuperPassProductFareInfoResponseAppModel$$serializer.f8647a, superPassProductFareInfoResponseAppModel3);
                        i7 |= 16384;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 15:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str13);
                        i5 = 32768;
                        i7 |= i5;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 16:
                        list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), list11);
                        i5 = 65536;
                        i7 |= i5;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 17:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str);
                        i6 = 131072;
                        i7 |= i6;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 18:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str12);
                        i6 = 262144;
                        i7 |= i6;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 19:
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (DeserializationStrategy) lazyArr[19].getValue(), list9);
                        i6 = 524288;
                        i7 |= i6;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    case 20:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), list5);
                        i5 = 1048576;
                        i7 |= i5;
                        str11 = str14;
                        bool8 = bool8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str15 = str11;
            Boolean bool10 = bool8;
            str2 = str15;
            list = list10;
            bool = bool7;
            str3 = str10;
            list2 = list5;
            bool2 = bool10;
            str4 = str12;
            list3 = list11;
            str5 = str13;
            superPassProductFareInfoResponseAppModel = superPassProductFareInfoResponseAppModel3;
            bool3 = bool9;
            i = i7;
            str6 = strDecodeStringElement2;
            list4 = list9;
            z = zDecodeBooleanElement3;
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement6;
            z2 = zDecodeBooleanElement4;
            d = dDecodeDoubleElement2;
            j = jDecodeLongElement2;
        }
        String str16 = str;
        String str17 = str2;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassProductConfigFareMappingResponseAppModel(i, str17, i2, bool2, str3, z, j, i4, str6, bool, bool3, i3, d, z2, list, superPassProductFareInfoResponseAppModel, str5, list3, str16, str4, list4, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        List list;
        SuperPassProductConfigFareMappingResponseAppModel value = (SuperPassProductConfigFareMappingResponseAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassProductConfigFareMappingResponseAppModel.v;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = value.f8642a;
        List list2 = value.u;
        List list3 = value.q;
        boolean z = value.m;
        double d = value.l;
        int i = value.k;
        int i2 = value.g;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.b);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, value.f);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || i2 != -1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 6, i2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, value.j);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || i != -1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 10, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || Double.compare(d, -1.0d) != 0) {
            compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 11, d);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || !z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 12, z);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), value.n);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 14, SuperPassProductFareInfoResponseAppModel$$serializer.f8647a, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, value.p);
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
            if (!Intrinsics.d(list, EmptyList.f17557a)) {
            }
            list = list3;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, value.r);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, value.s);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, (SerializationStrategy) lazyArr[19].getValue(), value.t);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || list2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        list = list3;
        list = list3;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 16, (SerializationStrategy) lazyArr[16].getValue(), list);
        list = list3;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, value.r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, value.s);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, (SerializationStrategy) lazyArr[19].getValue(), value.t);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
