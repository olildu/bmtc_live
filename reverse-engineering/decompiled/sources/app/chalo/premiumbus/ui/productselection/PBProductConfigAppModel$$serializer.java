package app.chalo.premiumbus.ui.productselection;

import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel$$serializer;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/ui/productselection/PBProductConfigAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/ui/productselection/PBProductConfigAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PBProductConfigAppModel$$serializer implements GeneratedSerializer<PBProductConfigAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PBProductConfigAppModel$$serializer f7690a;
    private static final SerialDescriptor descriptor;

    static {
        PBProductConfigAppModel$$serializer pBProductConfigAppModel$$serializer = new PBProductConfigAppModel$$serializer();
        f7690a = pBProductConfigAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.ui.productselection.PBProductConfigAppModel", pBProductConfigAppModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("desc", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("isActive", true);
        pluginGeneratedSerialDescriptor.j("isVisible", true);
        pluginGeneratedSerialDescriptor.j("maxAppVer", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("terms", false);
        pluginGeneratedSerialDescriptor.j("label", false);
        pluginGeneratedSerialDescriptor.j("imageUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PBProductConfigAppModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(BrandingApiModel$$serializer.f7145a);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[12].getValue());
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerC3, kSerializerC4, kSerializerC5};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        List list;
        int i;
        String str2;
        BrandingApiModel brandingApiModel;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBProductConfigAppModel.p;
        int i4 = 9;
        int i5 = 7;
        int i6 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            BrandingApiModel brandingApiModel2 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BrandingApiModel$$serializer.f7145a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            i = 32767;
            str = str11;
            str9 = strDecodeStringElement6;
            str4 = strDecodeStringElement;
            str7 = strDecodeStringElement4;
            i2 = iDecodeIntElement;
            z = zDecodeBooleanElement2;
            z2 = zDecodeBooleanElement;
            str5 = strDecodeStringElement2;
            i3 = iDecodeIntElement2;
            str6 = strDecodeStringElement3;
            str8 = strDecodeStringElement5;
            list = list2;
            brandingApiModel = brandingApiModel2;
            str2 = str10;
        } else {
            boolean z3 = true;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement4 = 0;
            String str12 = null;
            String str13 = null;
            BrandingApiModel brandingApiModel3 = null;
            String str14 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int i7 = 0;
            List list3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i5 = 7;
                        i6 = 4;
                        break;
                    case 0:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str13);
                        i7 |= 1;
                        i4 = 9;
                        i5 = 7;
                        i6 = 4;
                        break;
                    case 1:
                        brandingApiModel3 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BrandingApiModel$$serializer.f7145a, brandingApiModel3);
                        i7 |= 2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 4;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i4 = 9;
                        i6 = 4;
                        break;
                    case 3:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        i4 = 9;
                        i6 = 4;
                        break;
                    case 4:
                        int i8 = i6;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i7 |= 16;
                        i6 = i8;
                        i4 = 9;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i7 |= 32;
                        i6 = 4;
                        break;
                    case 6:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i7 |= 64;
                        i6 = 4;
                        break;
                    case 7:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i5);
                        i7 |= 128;
                        i6 = 4;
                        break;
                    case 8:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i7 |= 256;
                        i6 = 4;
                        break;
                    case 9:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i7 |= 512;
                        i6 = 4;
                        break;
                    case 10:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        i6 = 4;
                        break;
                    case 11:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        i6 = 4;
                        break;
                    case 12:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list3);
                        i7 |= 4096;
                        i6 = 4;
                        break;
                    case 13:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str12);
                        i7 |= 8192;
                        i6 = 4;
                        break;
                    case 14:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str14);
                        i7 |= 16384;
                        i6 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str12;
            list = list3;
            i = i7;
            str2 = str13;
            brandingApiModel = brandingApiModel3;
            str3 = str14;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
            str6 = strDecodeStringElement9;
            str7 = strDecodeStringElement10;
            str8 = strDecodeStringElement11;
            str9 = strDecodeStringElement12;
            i2 = iDecodeIntElement3;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            i3 = iDecodeIntElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PBProductConfigAppModel(i, str2, brandingApiModel, str4, str5, str6, z2, z, i2, i3, str7, str8, str9, list, str, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PBProductConfigAppModel value = (PBProductConfigAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBProductConfigAppModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = value.f7689a;
        boolean z = value.g;
        boolean z2 = value.f;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, BrandingApiModel$$serializer.f7145a, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z);
        }
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
