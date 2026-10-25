package app.chalo.instantticket.config.models;

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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/instantticket/config/models/InstantTicketConfigurationApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/instantticket/config/models/InstantTicketConfigurationApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class InstantTicketConfigurationApiModel$$serializer implements GeneratedSerializer<InstantTicketConfigurationApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InstantTicketConfigurationApiModel$$serializer f3834a;
    private static final SerialDescriptor descriptor;

    static {
        InstantTicketConfigurationApiModel$$serializer instantTicketConfigurationApiModel$$serializer = new InstantTicketConfigurationApiModel$$serializer();
        f3834a = instantTicketConfigurationApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.instantticket.config.models.InstantTicketConfigurationApiModel", instantTicketConfigurationApiModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("activeDuration", false);
        pluginGeneratedSerialDescriptor.j("showOtherModes", false);
        pluginGeneratedSerialDescriptor.j("showFindMyFare", false);
        pluginGeneratedSerialDescriptor.j("productImageUrls", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = InstantTicketConfigurationApiModel.n;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(BrandingDetails$$serializer.f3828a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(FareInfo$$serializer.f3830a), BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[12].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Long l;
        String str;
        String str2;
        String str3;
        Boolean bool;
        Boolean bool2;
        String str4;
        String str5;
        FareInfo fareInfo;
        String str6;
        int i;
        BrandingDetails brandingDetails;
        List list;
        Boolean bool3;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = InstantTicketConfigurationApiModel.n;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            BrandingDetails brandingDetails2 = (BrandingDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BrandingDetails$$serializer.f3828a, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            FareInfo fareInfo2 = (FareInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FareInfo$$serializer.f3830a, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            str4 = str13;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            i = 8191;
            brandingDetails = brandingDetails2;
            fareInfo = fareInfo2;
            str6 = str12;
            str3 = str11;
            bool2 = bool5;
            bool3 = bool4;
            str2 = str10;
            str = str9;
            str5 = str8;
        } else {
            int i3 = 12;
            int i4 = 0;
            Boolean bool6 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            l = null;
            String str17 = null;
            List list2 = null;
            FareInfo fareInfo3 = null;
            String str18 = null;
            boolean z = true;
            BrandingDetails brandingDetails3 = null;
            while (z) {
                int i5 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        list2 = list2;
                        bool6 = bool6;
                        i4 = i4;
                        i3 = 12;
                        break;
                    case 0:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str7);
                        i4 |= 1;
                        list2 = list2;
                        bool6 = bool6;
                        i3 = 12;
                        break;
                    case 1:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str14);
                        i2 = i4 | 2;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 2:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str15);
                        i2 = i4 | 4;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 3:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str16);
                        i2 = i4 | 8;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 4:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool6);
                        i2 = i4 | 16;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 5:
                        brandingDetails3 = (BrandingDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BrandingDetails$$serializer.f3828a, brandingDetails3);
                        i2 = i4 | 32;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 6:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str18);
                        i2 = i4 | 64;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 7:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str17);
                        i2 = i4 | 128;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 8:
                        fareInfo3 = (FareInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FareInfo$$serializer.f3830a, fareInfo3);
                        i2 = i4 | 256;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 9:
                        l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, l);
                        i2 = i4 | 512;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 10:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.f18123a, bool8);
                        i2 = i4 | 1024;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 11:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.f18123a, bool7);
                        i2 = i4 | 2048;
                        list2 = list2;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 12:
                        str7 = str7;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list2);
                        i4 |= 4096;
                        i3 = i5;
                        str7 = str7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str14;
            str2 = str15;
            str3 = str16;
            bool = bool7;
            bool2 = bool8;
            str4 = str17;
            str5 = str7;
            fareInfo = fareInfo3;
            str6 = str18;
            i = i4;
            brandingDetails = brandingDetails3;
            list = list2;
            bool3 = bool6;
        }
        Long l2 = l;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InstantTicketConfigurationApiModel(i, str5, str, str2, str3, bool3, brandingDetails, str6, str4, fareInfo, l2, bool2, bool, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        InstantTicketConfigurationApiModel value = (InstantTicketConfigurationApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = InstantTicketConfigurationApiModel.n;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f3833a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, BrandingDetails$$serializer.f3828a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, FareInfo$$serializer.f3830a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), value.m);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
