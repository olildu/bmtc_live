package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/TabMetaDataAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/TabMetaDataAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TabMetaDataAppModel$$serializer implements GeneratedSerializer<TabMetaDataAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TabMetaDataAppModel$$serializer f3815a;
    private static final SerialDescriptor descriptor;

    static {
        TabMetaDataAppModel$$serializer tabMetaDataAppModel$$serializer = new TabMetaDataAppModel$$serializer();
        f3815a = tabMetaDataAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.TabMetaDataAppModel", tabMetaDataAppModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("bgHighlightType", true);
        pluginGeneratedSerialDescriptor.j("bgHighlightColor", true);
        pluginGeneratedSerialDescriptor.j("headerIcon", true);
        pluginGeneratedSerialDescriptor.j("headerItems", true);
        pluginGeneratedSerialDescriptor.j("headerTitle", true);
        pluginGeneratedSerialDescriptor.j("searchBarTitle", true);
        pluginGeneratedSerialDescriptor.j("storiesPlotlineWidgetId", true);
        pluginGeneratedSerialDescriptor.j("chaloBusHeaderAppModel", true);
        pluginGeneratedSerialDescriptor.j("bgHighlightImageUrl", true);
        pluginGeneratedSerialDescriptor.j("bgHighlightImageBottomPadding", true);
        pluginGeneratedSerialDescriptor.j("payForTicketTitle", true);
        pluginGeneratedSerialDescriptor.j("payForTicketDesc", true);
        pluginGeneratedSerialDescriptor.j("tabBottomPadding", true);
        pluginGeneratedSerialDescriptor.j("headerIconLink", true);
        pluginGeneratedSerialDescriptor.j("headerIconLinkTitle", true);
        pluginGeneratedSerialDescriptor.j("searchCard", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TabMetaDataAppModel.q;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{lazyArr[0].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[2].getValue()), lazyArr[3].getValue(), stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c(ChaloBusHeaderAppModel$$serializer.f3724a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(SearchCardAppModel$$serializer.f3810a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        BgHighlightType bgHighlightType;
        String str2;
        ChaloBusHeaderAppModel chaloBusHeaderAppModel;
        List list;
        IconType iconType;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        Integer num2;
        int i;
        SearchCardAppModel searchCardAppModel;
        String str7;
        String str8;
        String str9;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TabMetaDataAppModel.q;
        BgHighlightType bgHighlightType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BgHighlightType bgHighlightType3 = (BgHighlightType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            IconType iconType2 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            ChaloBusHeaderAppModel chaloBusHeaderAppModel2 = (ChaloBusHeaderAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ChaloBusHeaderAppModel$$serializer.f3724a, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, intSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            searchCardAppModel = (SearchCardAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, SearchCardAppModel$$serializer.f3810a, null);
            bgHighlightType = bgHighlightType3;
            str7 = strDecodeStringElement;
            iconType = iconType2;
            str3 = str10;
            i = 65535;
            str8 = strDecodeStringElement2;
            num2 = num3;
            chaloBusHeaderAppModel = chaloBusHeaderAppModel2;
            str9 = strDecodeStringElement3;
            str2 = str11;
            str6 = str12;
            str4 = str14;
            num = num4;
            str5 = str13;
            list = list2;
        } else {
            int i2 = 3;
            int i3 = 2;
            int i4 = 1;
            int i5 = 0;
            int i6 = 0;
            SearchCardAppModel searchCardAppModel2 = null;
            String str15 = null;
            ChaloBusHeaderAppModel chaloBusHeaderAppModel3 = null;
            List list3 = null;
            IconType iconType3 = null;
            String str16 = null;
            String str17 = null;
            Integer num5 = null;
            String str18 = null;
            String str19 = null;
            str = null;
            Integer num6 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (i4 != 0) {
                bgHighlightType2 = bgHighlightType2;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bgHighlightType2 = bgHighlightType2;
                        i4 = i6;
                        searchCardAppModel2 = searchCardAppModel2;
                        i3 = 2;
                        i2 = 3;
                        i5 = i5;
                        i6 = i4;
                        break;
                    case 0:
                        SearchCardAppModel searchCardAppModel3 = searchCardAppModel2;
                        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) lazyArr[i6].getValue();
                        int i7 = i6;
                        bgHighlightType2 = (BgHighlightType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, deserializationStrategy, bgHighlightType2);
                        i6 = i7;
                        i3 = 2;
                        i2 = 3;
                        i5 |= 1;
                        searchCardAppModel2 = searchCardAppModel3;
                        break;
                    case 1:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str16);
                        i5 |= 2;
                        searchCardAppModel2 = searchCardAppModel2;
                        i3 = 2;
                        i2 = 3;
                        break;
                    case 2:
                        iconType3 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), iconType3);
                        i5 |= 4;
                        str16 = str16;
                        i2 = 3;
                        break;
                    case 3:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i2].getValue(), list3);
                        i5 |= 8;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 5:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 6:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 7:
                        chaloBusHeaderAppModel3 = (ChaloBusHeaderAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ChaloBusHeaderAppModel$$serializer.f3724a, chaloBusHeaderAppModel3);
                        i5 |= 128;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 8:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str15);
                        i5 |= 256;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 9:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.f18146a, num6);
                        i5 |= 512;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 10:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str19);
                        i5 |= 1024;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 11:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str18);
                        i5 |= 2048;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 12:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.f18146a, num5);
                        i5 |= 4096;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 13:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str);
                        i5 |= 8192;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 14:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str17);
                        i5 |= 16384;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    case 15:
                        searchCardAppModel2 = (SearchCardAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, SearchCardAppModel$$serializer.f3810a, searchCardAppModel2);
                        i5 |= 32768;
                        bgHighlightType2 = bgHighlightType2;
                        str16 = str16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bgHighlightType = bgHighlightType2;
            str2 = str15;
            chaloBusHeaderAppModel = chaloBusHeaderAppModel3;
            list = list3;
            iconType = iconType3;
            str3 = str16;
            str4 = str17;
            num = num5;
            str5 = str18;
            str6 = str19;
            num2 = num6;
            i = i5;
            searchCardAppModel = searchCardAppModel2;
            str7 = strDecodeStringElement4;
            str8 = strDecodeStringElement5;
            str9 = strDecodeStringElement6;
        }
        String str20 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TabMetaDataAppModel(i, bgHighlightType, str3, iconType, list, str7, str8, str9, chaloBusHeaderAppModel, str2, num2, str6, str5, num, str20, str4, searchCardAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TabMetaDataAppModel value = (TabMetaDataAppModel) obj;
        Intrinsics.i(value, "value");
        SearchCardAppModel searchCardAppModel = value.p;
        String str = value.o;
        String str2 = value.n;
        Integer num = value.m;
        String str3 = value.l;
        String str4 = value.k;
        Integer num2 = value.j;
        String str5 = value.i;
        ChaloBusHeaderAppModel chaloBusHeaderAppModel = value.h;
        String str6 = value.g;
        String str7 = value.f;
        String str8 = value.e;
        List list = value.d;
        IconType iconType = value.c;
        String str9 = value.b;
        BgHighlightType bgHighlightType = value.f3814a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TabMetaDataAppModel.q;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || bgHighlightType != BgHighlightType.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) lazyArr[r3].getValue(), bgHighlightType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str9 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || iconType != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), iconType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.d(str8, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(str7, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(str6, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || chaloBusHeaderAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, ChaloBusHeaderAppModel$$serializer.f3724a, chaloBusHeaderAppModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || num2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.f18146a, num2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || num != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || searchCardAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, SearchCardAppModel$$serializer.f3810a, searchCardAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
