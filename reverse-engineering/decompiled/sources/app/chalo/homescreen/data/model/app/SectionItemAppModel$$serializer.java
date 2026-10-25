package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/SectionItemAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/SectionItemAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SectionItemAppModel$$serializer implements GeneratedSerializer<SectionItemAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SectionItemAppModel$$serializer f3813a;
    private static final SerialDescriptor descriptor;

    static {
        SectionItemAppModel$$serializer sectionItemAppModel$$serializer = new SectionItemAppModel$$serializer();
        f3813a = sectionItemAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.SectionItemAppModel", sectionItemAppModel$$serializer, 16);
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
        pluginGeneratedSerialDescriptor.j(InMobiNetworkValues.ICON, true);
        pluginGeneratedSerialDescriptor.j("itemFallbackImage", true);
        pluginGeneratedSerialDescriptor.j("itemFullWidth", true);
        pluginGeneratedSerialDescriptor.j("onClickUrl", true);
        pluginGeneratedSerialDescriptor.j("ctaType", true);
        pluginGeneratedSerialDescriptor.j("contentPadding", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SectionItemAppModel.q;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), intSerializer, BuiltinSerializersKt.c(ItemTextDataAppModel$$serializer.f3758a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), stringSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), lazyArr[9].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[10].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[11].getValue()), BooleanSerializer.f18123a, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        Integer num;
        String str2;
        ItemTextDataAppModel itemTextDataAppModel;
        IconType iconType;
        List list;
        String str3;
        String str4;
        IconType iconType2;
        String str5;
        String str6;
        String str7;
        int i;
        String str8;
        String str9;
        boolean z;
        int i2;
        String str10;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SectionItemAppModel.q;
        String str11 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            ItemTextDataAppModel itemTextDataAppModel2 = (ItemTextDataAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ItemTextDataAppModel$$serializer.f3758a, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            IconType iconType3 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            IconType iconType4 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.f18146a, null);
            i = 65535;
            itemTextDataAppModel = itemTextDataAppModel2;
            list = list2;
            str7 = str13;
            str = str12;
            str5 = str16;
            str9 = strDecodeStringElement;
            str4 = str15;
            str6 = str14;
            str3 = str17;
            z = zDecodeBooleanElement;
            i2 = iDecodeIntElement;
            str8 = str19;
            str2 = str18;
            iconType2 = iconType4;
            iconType = iconType3;
        } else {
            int i3 = 9;
            boolean z2 = true;
            int i4 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            String str20 = null;
            Integer num2 = null;
            String str21 = null;
            ItemTextDataAppModel itemTextDataAppModel3 = null;
            String str22 = null;
            IconType iconType5 = null;
            List list3 = null;
            String str23 = null;
            String str24 = null;
            IconType iconType6 = null;
            String str25 = null;
            String str26 = null;
            String strDecodeStringElement2 = null;
            while (z2) {
                str11 = str11;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str10 = str11;
                        z2 = false;
                        i4 = i4;
                        i3 = 9;
                        str11 = str10;
                        str20 = str20;
                        break;
                    case 0:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str11);
                        i4 |= 1;
                        str22 = str22;
                        i3 = 9;
                        str11 = str10;
                        str20 = str20;
                        break;
                    case 1:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str22);
                        i4 |= 2;
                        str20 = str20;
                        i3 = 9;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 |= 4;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 3:
                        itemTextDataAppModel3 = (ItemTextDataAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ItemTextDataAppModel$$serializer.f3758a, itemTextDataAppModel3);
                        i4 |= 8;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 4:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str26);
                        i4 |= 16;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 5:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str24);
                        i4 |= 32;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 6:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 7:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str25);
                        i4 |= 128;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 8:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str23);
                        i4 |= 256;
                        str22 = str22;
                        i3 = 9;
                        break;
                    case 9:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list3);
                        i4 |= 512;
                        str11 = str11;
                        str22 = str22;
                        break;
                    case 10:
                        iconType5 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), iconType5);
                        i4 |= 1024;
                        str11 = str11;
                        str22 = str22;
                        break;
                    case 11:
                        iconType6 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), iconType6);
                        i4 |= 2048;
                        str11 = str11;
                        str22 = str22;
                        break;
                    case 12:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i4 |= 4096;
                        str11 = str11;
                        str22 = str22;
                        break;
                    case 13:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str21);
                        i4 |= 8192;
                        str11 = str11;
                        str22 = str22;
                        break;
                    case 14:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str20);
                        i4 |= 16384;
                        str11 = str11;
                        str22 = str22;
                        break;
                    case 15:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.f18146a, num2);
                        i4 |= 32768;
                        str11 = str11;
                        str22 = str22;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str11;
            num = num2;
            str2 = str21;
            itemTextDataAppModel = itemTextDataAppModel3;
            iconType = iconType5;
            list = list3;
            str3 = str23;
            str4 = str24;
            iconType2 = iconType6;
            str5 = str25;
            str6 = str26;
            str7 = str22;
            i = i4;
            str8 = str20;
            str9 = strDecodeStringElement2;
            z = zDecodeBooleanElement2;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SectionItemAppModel(i, str, str7, i2, itemTextDataAppModel, str6, str4, str9, str5, str3, list, iconType, iconType2, z, str2, str8, num);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SectionItemAppModel value = (SectionItemAppModel) obj;
        Intrinsics.i(value, "value");
        Integer num = value.p;
        String str = value.o;
        String str2 = value.b;
        String str3 = value.f3812a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SectionItemAppModel.q;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
        }
        int i = value.c;
        String str4 = value.n;
        boolean z = value.m;
        IconType iconType = value.l;
        IconType iconType2 = value.k;
        List list = value.j;
        String str5 = value.i;
        String str6 = value.h;
        String str7 = value.f;
        String str8 = value.e;
        ItemTextDataAppModel itemTextDataAppModel = value.d;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || itemTextDataAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ItemTextDataAppModel$$serializer.f3758a, itemTextDataAppModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str7);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || iconType2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), iconType2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || iconType != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (SerializationStrategy) lazyArr[11].getValue(), iconType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 12, z);
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
