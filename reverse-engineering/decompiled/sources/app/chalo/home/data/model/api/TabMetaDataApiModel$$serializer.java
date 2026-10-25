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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/home/data/model/api/TabMetaDataApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/home/data/model/api/TabMetaDataApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TabMetaDataApiModel$$serializer implements GeneratedSerializer<TabMetaDataApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TabMetaDataApiModel$$serializer f2907a;
    private static final SerialDescriptor descriptor;

    static {
        TabMetaDataApiModel$$serializer tabMetaDataApiModel$$serializer = new TabMetaDataApiModel$$serializer();
        f2907a = tabMetaDataApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.home.data.model.api.TabMetaDataApiModel", tabMetaDataApiModel$$serializer, 18);
        pluginGeneratedSerialDescriptor.j("bgHighlightType", true);
        pluginGeneratedSerialDescriptor.j("bgHighlightColor", true);
        pluginGeneratedSerialDescriptor.j("bottomNavIconIdSelected", false);
        pluginGeneratedSerialDescriptor.j("bottomNavIconIdUnselected", false);
        pluginGeneratedSerialDescriptor.j("headerIcon", true);
        pluginGeneratedSerialDescriptor.j("headerItems", true);
        pluginGeneratedSerialDescriptor.j("headerTitle", true);
        pluginGeneratedSerialDescriptor.j("searchBarTitle", true);
        pluginGeneratedSerialDescriptor.j("chaloBusHeaderData", true);
        pluginGeneratedSerialDescriptor.j("storiesPlotlineWidgetId", true);
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

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TabMetaDataApiModel.s;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue());
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(ChaloBusHeaderApiModel$$serializer.f2881a);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, stringSerializer, stringSerializer, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(SearchCardApiModel$$serializer.f2901a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        ChaloBusHeaderApiModel chaloBusHeaderApiModel;
        SearchCardApiModel searchCardApiModel;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Integer num;
        String str11;
        String str12;
        String str13;
        List list;
        int i;
        Integer num2;
        int i2;
        List list2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TabMetaDataApiModel.s;
        String str14 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            ChaloBusHeaderApiModel chaloBusHeaderApiModel2 = (ChaloBusHeaderApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ChaloBusHeaderApiModel$$serializer.f2881a, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            searchCardApiModel = (SearchCardApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, SearchCardApiModel$$serializer.f2901a, null);
            i = 262143;
            chaloBusHeaderApiModel = chaloBusHeaderApiModel2;
            str11 = strDecodeStringElement;
            str9 = str18;
            str2 = str16;
            str = str15;
            str7 = str21;
            str8 = str20;
            str10 = str19;
            str4 = str24;
            str12 = strDecodeStringElement2;
            str13 = str17;
            str3 = str25;
            num2 = num4;
            str5 = str23;
            str6 = str22;
            num = num3;
            list = list3;
        } else {
            int i3 = 5;
            boolean z = true;
            int i4 = 0;
            Integer num5 = null;
            Integer num6 = null;
            List list4 = null;
            ChaloBusHeaderApiModel chaloBusHeaderApiModel3 = null;
            SearchCardApiModel searchCardApiModel2 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            while (z) {
                List list5 = list4;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        num6 = num6;
                        list4 = list5;
                        i4 = i4;
                        i3 = 5;
                        break;
                    case 0:
                        list2 = list5;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str33);
                        i4 |= 1;
                        num6 = num6;
                        list4 = list2;
                        num5 = num5;
                        i3 = 5;
                        break;
                    case 1:
                        list2 = list5;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str34);
                        i4 |= 2;
                        str35 = str35;
                        list4 = list2;
                        num5 = num5;
                        i3 = 5;
                        break;
                    case 2:
                        list2 = list5;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        list4 = list2;
                        num5 = num5;
                        i3 = 5;
                        break;
                    case 3:
                        list2 = list5;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        list4 = list2;
                        num5 = num5;
                        i3 = 5;
                        break;
                    case 4:
                        list2 = list5;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str35);
                        i4 |= 16;
                        list4 = list2;
                        num5 = num5;
                        i3 = 5;
                        break;
                    case 5:
                        Integer num7 = num5;
                        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) lazyArr[i3].getValue();
                        int i5 = i3;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, deserializationStrategy, list5);
                        i3 = i5;
                        i4 |= 32;
                        num5 = num7;
                        break;
                    case 6:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str31);
                        i4 |= 64;
                        num5 = num5;
                        list4 = list5;
                        break;
                    case 7:
                        str31 = str31;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str32);
                        i4 |= 128;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 8:
                        str31 = str31;
                        chaloBusHeaderApiModel3 = (ChaloBusHeaderApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ChaloBusHeaderApiModel$$serializer.f2881a, chaloBusHeaderApiModel3);
                        i4 |= 256;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 9:
                        str31 = str31;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str30);
                        i4 |= 512;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 10:
                        str31 = str31;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str29);
                        i4 |= 1024;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 11:
                        str31 = str31;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.f18146a, num6);
                        i4 |= 2048;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 12:
                        str31 = str31;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str28);
                        i4 |= 4096;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 13:
                        str31 = str31;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str27);
                        i4 |= 8192;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 14:
                        str31 = str31;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.f18146a, num5);
                        i4 |= 16384;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 15:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str14);
                        i2 = 32768;
                        i4 |= i2;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 16:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str26);
                        i2 = 65536;
                        i4 |= i2;
                        list4 = list5;
                        str31 = str31;
                        break;
                    case 17:
                        searchCardApiModel2 = (SearchCardApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, SearchCardApiModel$$serializer.f2901a, searchCardApiModel2);
                        i2 = 131072;
                        i4 |= i2;
                        list4 = list5;
                        str31 = str31;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str33;
            str2 = str34;
            chaloBusHeaderApiModel = chaloBusHeaderApiModel3;
            searchCardApiModel = searchCardApiModel2;
            str3 = str26;
            str4 = str14;
            str5 = str27;
            str6 = str28;
            str7 = str29;
            str8 = str30;
            str9 = str31;
            str10 = str32;
            num = num6;
            str11 = strDecodeStringElement3;
            str12 = strDecodeStringElement4;
            str13 = str35;
            list = list4;
            i = i4;
            num2 = num5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TabMetaDataApiModel(i, str, str2, str11, str12, str13, list, str9, str10, chaloBusHeaderApiModel, str8, str7, num, str6, str5, num2, str4, str3, searchCardApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TabMetaDataApiModel value = (TabMetaDataApiModel) obj;
        Intrinsics.i(value, "value");
        SearchCardApiModel searchCardApiModel = value.r;
        String str = value.q;
        String str2 = value.p;
        Integer num = value.o;
        String str3 = value.b;
        String str4 = value.f2906a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TabMetaDataApiModel.s;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str3);
        }
        String str5 = value.c;
        String str6 = value.n;
        String str7 = value.m;
        Integer num2 = value.l;
        String str8 = value.k;
        String str9 = value.j;
        ChaloBusHeaderApiModel chaloBusHeaderApiModel = value.i;
        String str10 = value.h;
        String str11 = value.g;
        List list = value.f;
        String str12 = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str5);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str12 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str12);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str11 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str11);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str10 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || chaloBusHeaderApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, ChaloBusHeaderApiModel$$serializer.f2881a, chaloBusHeaderApiModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || str9 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || num2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.f18146a, num2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || searchCardApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, SearchCardApiModel$$serializer.f2901a, searchCardApiModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
