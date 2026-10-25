package app.chalo.home.data.model.api;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/home/data/model/api/SectionApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/home/data/model/api/SectionApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SectionApiModel$$serializer implements GeneratedSerializer<SectionApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SectionApiModel$$serializer f2903a;
    private static final SerialDescriptor descriptor;

    static {
        SectionApiModel$$serializer sectionApiModel$$serializer = new SectionApiModel$$serializer();
        f2903a = sectionApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.home.data.model.api.SectionApiModel", sectionApiModel$$serializer, 22);
        pluginGeneratedSerialDescriptor.j("sectionId", false);
        pluginGeneratedSerialDescriptor.j("plotlineWidgetId", true);
        pluginGeneratedSerialDescriptor.j("sectionHeader", true);
        pluginGeneratedSerialDescriptor.j("sectionPriority", false);
        pluginGeneratedSerialDescriptor.j("faqQnA", true);
        pluginGeneratedSerialDescriptor.j("sectionTitle", true);
        pluginGeneratedSerialDescriptor.j("sectionDesc", true);
        pluginGeneratedSerialDescriptor.j("sectionCta", true);
        pluginGeneratedSerialDescriptor.j("sectionTitleCta", true);
        pluginGeneratedSerialDescriptor.j("sectionItems", true);
        pluginGeneratedSerialDescriptor.j("sectionType", false);
        pluginGeneratedSerialDescriptor.j("adSlot", true);
        pluginGeneratedSerialDescriptor.j("shouldHighlight", true);
        pluginGeneratedSerialDescriptor.j("sectionCtaDisplayType", true);
        pluginGeneratedSerialDescriptor.j("sectionIconId", true);
        pluginGeneratedSerialDescriptor.j("maxHeightDp", true);
        pluginGeneratedSerialDescriptor.j("backgroundImageUrl", true);
        pluginGeneratedSerialDescriptor.j("contentPadding", true);
        pluginGeneratedSerialDescriptor.j("placement", true);
        pluginGeneratedSerialDescriptor.j("showDivider", true);
        pluginGeneratedSerialDescriptor.j("onClickUrl", true);
        pluginGeneratedSerialDescriptor.j("ctaType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SectionApiModel.w;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue());
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c((KSerializer) lazyArr[9].getValue());
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, kSerializerC, kSerializerC2, intSerializer, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, stringSerializer, kSerializerC9, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        Boolean bool2;
        String str5;
        Integer num;
        String str6;
        int i;
        Integer num2;
        List list;
        String str7;
        List list2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i2;
        String str15;
        int i3;
        int i4;
        String str16;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SectionApiModel.w;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, intSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, intSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, booleanSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            str5 = str28;
            str3 = str27;
            str8 = str19;
            i2 = iDecodeIntElement;
            str7 = str18;
            str11 = str22;
            str12 = strDecodeStringElement2;
            list2 = list3;
            str = str17;
            i = 4194303;
            str10 = str21;
            str4 = str23;
            bool = bool4;
            num = num4;
            str6 = str26;
            num2 = num3;
            str13 = str25;
            str14 = str24;
            bool2 = bool3;
            list = list4;
            str15 = strDecodeStringElement;
            str9 = str20;
        } else {
            int i5 = 9;
            int i6 = 4;
            boolean z = true;
            int iDecodeIntElement2 = 0;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            Boolean bool5 = null;
            String str33 = null;
            String str34 = null;
            Boolean bool6 = null;
            String str35 = null;
            Integer num5 = null;
            Integer num6 = null;
            List list5 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str36 = null;
            String str37 = null;
            List list6 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            int i7 = 0;
            String str41 = null;
            while (z) {
                String str42 = str31;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str31 = str42;
                        str30 = str30;
                        str29 = str29;
                        i6 = 4;
                        i5 = 9;
                        break;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        str31 = str42;
                        str30 = str30;
                        str29 = str29;
                        i6 = 4;
                        i5 = 9;
                        break;
                    case 1:
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str36);
                        i7 |= 2;
                        str37 = str37;
                        str31 = str42;
                        str30 = str30;
                        str29 = str29;
                        i6 = 4;
                        i5 = 9;
                        break;
                    case 2:
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str37);
                        i7 |= 4;
                        list6 = list6;
                        str31 = str42;
                        str30 = str30;
                        str29 = str29;
                        i6 = 4;
                        i5 = 9;
                        break;
                    case 3:
                        i4 = i6;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i7 |= 8;
                        str31 = str42;
                        str29 = str29;
                        i5 = 9;
                        i6 = i4;
                        str30 = str30;
                        break;
                    case 4:
                        i4 = i6;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i6].getValue(), list6);
                        i7 |= 16;
                        str38 = str38;
                        str31 = str42;
                        str29 = str29;
                        i5 = 9;
                        i6 = i4;
                        str30 = str30;
                        break;
                    case 5:
                        str16 = str42;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str38);
                        i7 |= 32;
                        str39 = str39;
                        str31 = str16;
                        str30 = str30;
                        str29 = str29;
                        i5 = 9;
                        break;
                    case 6:
                        str16 = str42;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str39);
                        i7 |= 64;
                        str40 = str40;
                        str31 = str16;
                        str30 = str30;
                        str29 = str29;
                        i5 = 9;
                        break;
                    case 7:
                        str16 = str42;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str40);
                        i7 |= 128;
                        str31 = str16;
                        str30 = str30;
                        str29 = str29;
                        i5 = 9;
                        break;
                    case 8:
                        str29 = str29;
                        str30 = str30;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str42);
                        i7 |= 256;
                        str30 = str30;
                        str29 = str29;
                        i5 = 9;
                        break;
                    case 9:
                        List list7 = list5;
                        int i8 = i5;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, (DeserializationStrategy) lazyArr[i5].getValue(), list7);
                        i7 |= 512;
                        i5 = i8;
                        str29 = str29;
                        str31 = str42;
                        break;
                    case 10:
                        list5 = list5;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 11:
                        list5 = list5;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str34);
                        i7 |= 2048;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 12:
                        list5 = list5;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.f18123a, bool6);
                        i7 |= 4096;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 13:
                        list5 = list5;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str29);
                        i7 |= 8192;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 14:
                        list5 = list5;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str30);
                        i7 |= 16384;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 15:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.f18146a, num6);
                        i3 = 32768;
                        i7 |= i3;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 16:
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str41);
                        i3 = 65536;
                        i7 |= i3;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 17:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.f18146a, num5);
                        i3 = 131072;
                        i7 |= i3;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 18:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str33);
                        i3 = 262144;
                        i7 |= i3;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 19:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.f18123a, bool5);
                        i3 = 524288;
                        i7 |= i3;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 20:
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.f18170a, str35);
                        i3 = 1048576;
                        i7 |= i3;
                        str31 = str42;
                        list5 = list5;
                        break;
                    case 21:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.f18170a, str32);
                        i3 = 2097152;
                        i7 |= i3;
                        str31 = str42;
                        list5 = list5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str36;
            str2 = str32;
            bool = bool5;
            str3 = str33;
            str4 = str34;
            bool2 = bool6;
            str5 = str35;
            num = num5;
            str6 = str41;
            i = i7;
            num2 = num6;
            list = list5;
            str7 = str37;
            list2 = list6;
            str8 = str38;
            str9 = str39;
            str10 = str40;
            str11 = str31;
            str12 = strDecodeStringElement3;
            str13 = str30;
            str14 = str29;
            i2 = iDecodeIntElement2;
            str15 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SectionApiModel(i, str15, str, str7, i2, list2, str8, str9, str10, str11, list, str12, str4, bool2, str14, str13, num2, str6, num, str3, bool, str5, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SectionApiModel value = (SectionApiModel) obj;
        Intrinsics.i(value, "value");
        String str = value.v;
        String str2 = value.u;
        Boolean bool = value.t;
        String str3 = value.s;
        Integer num = value.r;
        String str4 = value.q;
        Integer num2 = value.p;
        String str5 = value.o;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SectionApiModel.w;
        String str6 = value.f2902a;
        String str7 = value.n;
        Boolean bool2 = value.m;
        String str8 = value.l;
        List list = value.j;
        String str9 = value.i;
        String str10 = value.h;
        String str11 = value.g;
        String str12 = value.f;
        List list2 = value.e;
        String str13 = value.c;
        String str14 = value.b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str6);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str14 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str14);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str13 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str13);
        }
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str12 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str12);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str11 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str11);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str10 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || str9 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), list);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || bool2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.f18123a, bool2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || num2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.f18146a, num2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.f18123a, bool);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
