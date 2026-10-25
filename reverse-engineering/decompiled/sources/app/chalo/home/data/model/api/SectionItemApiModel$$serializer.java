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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/home/data/model/api/SectionItemApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/home/data/model/api/SectionItemApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SectionItemApiModel$$serializer implements GeneratedSerializer<SectionItemApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SectionItemApiModel$$serializer f2905a;
    private static final SerialDescriptor descriptor;

    static {
        SectionItemApiModel$$serializer sectionItemApiModel$$serializer = new SectionItemApiModel$$serializer();
        f2905a = sectionItemApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.home.data.model.api.SectionItemApiModel", sectionItemApiModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("itemBgColor", true);
        pluginGeneratedSerialDescriptor.j("itemImageUrl", true);
        pluginGeneratedSerialDescriptor.j("itemPosition", false);
        pluginGeneratedSerialDescriptor.j("itemTextData", true);
        pluginGeneratedSerialDescriptor.j("itemTitle", true);
        pluginGeneratedSerialDescriptor.j("itemDesc", true);
        pluginGeneratedSerialDescriptor.j("itemType", false);
        pluginGeneratedSerialDescriptor.j("itemCta", true);
        pluginGeneratedSerialDescriptor.j("ctaDisplayType", true);
        pluginGeneratedSerialDescriptor.j("passCardDataList", true);
        pluginGeneratedSerialDescriptor.j("iconId", true);
        pluginGeneratedSerialDescriptor.j("itemFallbackImage", true);
        pluginGeneratedSerialDescriptor.j("itemFullWidth", true);
        pluginGeneratedSerialDescriptor.j("onClickUrl", true);
        pluginGeneratedSerialDescriptor.j("ctaType", true);
        pluginGeneratedSerialDescriptor.j("contentPadding", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SectionItemApiModel.q;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, intSerializer, BuiltinSerializersKt.c(ItemTextDataApiModel$$serializer.f2891a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), stringSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[9].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(BooleanSerializer.f18123a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        Boolean bool;
        ItemTextDataApiModel itemTextDataApiModel;
        String str3;
        Integer num;
        String str4;
        List list;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        String str10;
        String str11;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SectionItemApiModel.q;
        String str12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            ItemTextDataApiModel itemTextDataApiModel2 = (ItemTextDataApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ItemTextDataApiModel$$serializer.f2891a, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.f18123a, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.f18146a, null);
            i = 65535;
            str10 = str20;
            str4 = str18;
            str2 = str13;
            itemTextDataApiModel = itemTextDataApiModel2;
            str8 = str16;
            str11 = strDecodeStringElement;
            str6 = str15;
            str9 = str14;
            str5 = str17;
            str7 = str19;
            str3 = str21;
            bool = bool2;
            list = list2;
            i2 = iDecodeIntElement;
        } else {
            int i3 = 9;
            boolean z = true;
            int i4 = 0;
            int iDecodeIntElement2 = 0;
            String str22 = null;
            String str23 = null;
            Boolean bool3 = null;
            ItemTextDataApiModel itemTextDataApiModel3 = null;
            String str24 = null;
            Integer num2 = null;
            String str25 = null;
            List list3 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String strDecodeStringElement2 = null;
            String str30 = null;
            while (z) {
                String str31 = str24;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        z = false;
                        str23 = str23;
                        i4 = i4;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 0:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str30);
                        i4 |= 1;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        str23 = str23;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 1:
                        i4 |= 2;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        i3 = 9;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str31);
                        str22 = str22;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 |= 4;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        str22 = str22;
                        str24 = str31;
                        i3 = 9;
                        break;
                    case 3:
                        itemTextDataApiModel3 = (ItemTextDataApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ItemTextDataApiModel$$serializer.f2891a, itemTextDataApiModel3);
                        i4 |= 8;
                        str22 = str22;
                        str24 = str31;
                        i3 = 9;
                        break;
                    case 4:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str23);
                        i4 |= 16;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        i3 = 9;
                        break;
                    case 5:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str27);
                        i4 |= 32;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        i3 = 9;
                        break;
                    case 6:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        i3 = 9;
                        break;
                    case 7:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str29);
                        i4 |= 128;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        i3 = 9;
                        break;
                    case 8:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str26);
                        i4 |= 256;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        i3 = 9;
                        break;
                    case 9:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list3);
                        i4 |= 512;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        break;
                    case 10:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str25);
                        i4 |= 1024;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        break;
                    case 11:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str28);
                        i4 |= 2048;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        break;
                    case 12:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.f18123a, bool3);
                        i4 |= 4096;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        break;
                    case 13:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str22);
                        i4 |= 8192;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        break;
                    case 14:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str12);
                        i4 |= 16384;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        break;
                    case 15:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.f18146a, num2);
                        i4 |= 32768;
                        str24 = str31;
                        itemTextDataApiModel3 = itemTextDataApiModel3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str32 = str24;
            ItemTextDataApiModel itemTextDataApiModel4 = itemTextDataApiModel3;
            str = str32;
            str2 = str30;
            bool = bool3;
            itemTextDataApiModel = itemTextDataApiModel4;
            str3 = str12;
            num = num2;
            str4 = str25;
            list = list3;
            str5 = str26;
            str6 = str27;
            str7 = str28;
            str8 = str29;
            str9 = str23;
            i = i4;
            str10 = str22;
            str11 = strDecodeStringElement2;
            i2 = iDecodeIntElement2;
        }
        String str33 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SectionItemApiModel(i, str2, str33, i2, itemTextDataApiModel, str9, str6, str11, str8, str5, list, str4, str7, bool, str10, str3, num);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SectionItemApiModel value = (SectionItemApiModel) obj;
        Intrinsics.i(value, "value");
        Integer num = value.p;
        String str = value.o;
        String str2 = value.b;
        String str3 = value.f2904a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SectionItemApiModel.q;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
        }
        int i = value.c;
        String str4 = value.n;
        Boolean bool = value.m;
        String str5 = value.l;
        String str6 = value.k;
        List list = value.j;
        String str7 = value.i;
        String str8 = value.h;
        String str9 = value.f;
        String str10 = value.e;
        ItemTextDataApiModel itemTextDataApiModel = value.d;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || itemTextDataApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ItemTextDataApiModel$$serializer.f2891a, itemTextDataApiModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str10 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str9 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str9);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.f18123a, bool);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.f18146a, num);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
