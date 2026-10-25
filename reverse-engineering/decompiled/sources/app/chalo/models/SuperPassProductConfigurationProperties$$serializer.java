package app.chalo.models;

import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategorySelectionAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategorySelectionAppModel$$serializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/SuperPassProductConfigurationProperties.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/SuperPassProductConfigurationProperties;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassProductConfigurationProperties$$serializer implements GeneratedSerializer<SuperPassProductConfigurationProperties> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassProductConfigurationProperties$$serializer f5601a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassProductConfigurationProperties$$serializer superPassProductConfigurationProperties$$serializer = new SuperPassProductConfigurationProperties$$serializer();
        f5601a = superPassProductConfigurationProperties$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.SuperPassProductConfigurationProperties", superPassProductConfigurationProperties$$serializer, 24);
        pluginGeneratedSerialDescriptor.j("productId", false);
        pluginGeneratedSerialDescriptor.j("productCity", false);
        pluginGeneratedSerialDescriptor.j("productName", false);
        pluginGeneratedSerialDescriptor.j("productDesc", true);
        pluginGeneratedSerialDescriptor.j("productLogo", true);
        pluginGeneratedSerialDescriptor.j("productLabel", true);
        pluginGeneratedSerialDescriptor.j("productAdditionalInfo", true);
        pluginGeneratedSerialDescriptor.j("productPriority", true);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("productAgency", false);
        pluginGeneratedSerialDescriptor.j("productTermsAndConditions", true);
        pluginGeneratedSerialDescriptor.j("highlightedProductTermsAndConditions", true);
        pluginGeneratedSerialDescriptor.j("productActivationDuration", true);
        pluginGeneratedSerialDescriptor.j("isActive", true);
        pluginGeneratedSerialDescriptor.j("inactiveReason", true);
        pluginGeneratedSerialDescriptor.j("isVisible", true);
        pluginGeneratedSerialDescriptor.j("shouldHideSubCategorySelection", true);
        pluginGeneratedSerialDescriptor.j("serviceType", true);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("subCategorySelectionDetails", true);
        pluginGeneratedSerialDescriptor.j("minAppVer", true);
        pluginGeneratedSerialDescriptor.j("maxAppVer", true);
        pluginGeneratedSerialDescriptor.j("imageUrls", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassProductConfigurationProperties.y;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), intSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[11].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[12].getValue()), LongSerializer.f18151a, booleanSerializer, BuiltinSerializersKt.c(stringSerializer), booleanSerializer, booleanSerializer, lazyArr[18].getValue(), ProductBranding$$serializer.f5593a, BuiltinSerializersKt.c(ProductConfigSubCategorySelectionAppModel$$serializer.f8221a), intSerializer, intSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[23].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        ProductBranding productBranding;
        List list2;
        int i;
        List list3;
        ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel;
        List list4;
        String str5;
        int i2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z;
        boolean z2;
        int i3;
        long j;
        boolean z3;
        int i4;
        int i5;
        int i6;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassProductConfigurationProperties.y;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, (DeserializationStrategy) lazyArr[18].getValue(), null);
            ProductBranding productBranding2 = (ProductBranding) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 19, ProductBranding$$serializer.f5593a, null);
            ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel2 = (ProductConfigSubCategorySelectionAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, ProductConfigSubCategorySelectionAppModel$$serializer.f8221a, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
            productConfigSubCategorySelectionAppModel = productConfigSubCategorySelectionAppModel2;
            list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, (DeserializationStrategy) lazyArr[23].getValue(), null);
            i = 16777215;
            str4 = str14;
            str2 = str12;
            str8 = strDecodeStringElement3;
            str9 = strDecodeStringElement4;
            str = str13;
            i2 = iDecodeIntElement3;
            z = zDecodeBooleanElement3;
            str11 = strDecodeStringElement6;
            str10 = strDecodeStringElement5;
            i3 = iDecodeIntElement;
            str3 = str15;
            i4 = iDecodeIntElement2;
            z2 = zDecodeBooleanElement2;
            productBranding = productBranding2;
            z3 = zDecodeBooleanElement;
            str5 = str16;
            str7 = strDecodeStringElement2;
            list4 = list7;
            list = list6;
            j = jDecodeLongElement;
            list2 = list5;
            str6 = strDecodeStringElement;
        } else {
            boolean z4 = true;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement5 = 0;
            long jDecodeLongElement2 = 0;
            String str17 = null;
            List list8 = null;
            String str18 = null;
            String str19 = null;
            ProductBranding productBranding3 = null;
            List list9 = null;
            List list10 = null;
            ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel3 = null;
            List list11 = null;
            String str20 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int i7 = 0;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement6 = 0;
            String str21 = null;
            while (true) {
                boolean z5 = zDecodeBooleanElement6;
                if (z4) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z4 = false;
                            zDecodeBooleanElement6 = z5;
                            break;
                        case 0:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i7 |= 1;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 1:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i7 |= 2;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 2:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i7 |= 4;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 3:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str21);
                            i7 |= 8;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 4:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str17);
                            i7 |= 16;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 5:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str19);
                            i7 |= 32;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 6:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str18);
                            i7 |= 64;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 7:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                            i7 |= 128;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 8:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                            i7 |= 256;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 9:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                            i7 |= 512;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 10:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                            i7 |= 1024;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 11:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), list9);
                            i7 |= 2048;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 12:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list8);
                            i7 |= 4096;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 13:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                            i7 |= 8192;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 14:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            i7 |= 16384;
                            zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 15:
                            str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str20);
                            i5 = 32768;
                            i7 |= i5;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 16:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                            i7 |= 65536;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 17:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
                            i7 |= 131072;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 18:
                            list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, (DeserializationStrategy) lazyArr[18].getValue(), list11);
                            i6 = 262144;
                            i7 |= i6;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 19:
                            productBranding3 = (ProductBranding) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 19, ProductBranding$$serializer.f5593a, productBranding3);
                            i5 = 524288;
                            i7 |= i5;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 20:
                            productConfigSubCategorySelectionAppModel3 = (ProductConfigSubCategorySelectionAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, ProductConfigSubCategorySelectionAppModel$$serializer.f8221a, productConfigSubCategorySelectionAppModel3);
                            i5 = 1048576;
                            i7 |= i5;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 21:
                            i7 |= 2097152;
                            iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
                            zDecodeBooleanElement6 = z5;
                            break;
                        case 22:
                            iDecodeIntElement6 = iDecodeIntElement6;
                            iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
                            i7 |= 4194304;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        case 23:
                            list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, (DeserializationStrategy) lazyArr[23].getValue(), list10);
                            i6 = 8388608;
                            i7 |= i6;
                            zDecodeBooleanElement6 = z5;
                            iDecodeIntElement6 = iDecodeIntElement6;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    str = str17;
                    str2 = str21;
                    list = list8;
                    str3 = str18;
                    str4 = str19;
                    productBranding = productBranding3;
                    list2 = list9;
                    i = i7;
                    list3 = list10;
                    productConfigSubCategorySelectionAppModel = productConfigSubCategorySelectionAppModel3;
                    list4 = list11;
                    str5 = str20;
                    i2 = iDecodeIntElement4;
                    str6 = strDecodeStringElement7;
                    str7 = strDecodeStringElement8;
                    str8 = strDecodeStringElement9;
                    str9 = strDecodeStringElement10;
                    str10 = strDecodeStringElement11;
                    str11 = strDecodeStringElement12;
                    z = zDecodeBooleanElement4;
                    z2 = zDecodeBooleanElement5;
                    i3 = iDecodeIntElement5;
                    j = jDecodeLongElement2;
                    z3 = z5;
                    i4 = iDecodeIntElement6;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassProductConfigurationProperties(i, str6, str7, str8, str2, str, str4, str3, i3, str9, str10, str11, list2, list, j, z3, str5, z2, z, list4, productBranding, productConfigSubCategorySelectionAppModel, i4, i2, list3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:85:0x018d  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        List list;
        int i;
        int i2;
        SuperPassProductConfigurationProperties value = (SuperPassProductConfigurationProperties) obj;
        Intrinsics.i(value, "value");
        int i3 = value.w;
        int i4 = value.v;
        ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel = value.u;
        List list2 = value.s;
        boolean z = value.r;
        boolean z2 = value.q;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassProductConfigurationProperties.y;
        String str = value.f5600a;
        String str2 = value.p;
        boolean z3 = value.o;
        long j = value.n;
        List list3 = value.m;
        List list4 = value.l;
        int i5 = value.h;
        String str3 = value.g;
        String str4 = value.f;
        String str5 = value.e;
        String str6 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || i5 != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, i5);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || list4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (SerializationStrategy) lazyArr[11].getValue(), list4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || list3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), list3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || j != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 13, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 14, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 16, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 17, z);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
            list = list2;
            if (!Intrinsics.d(list, CollectionsKt.R(ProductConfigServiceType.REGULAR))) {
            }
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 19, ProductBranding$$serializer.f5593a, value.t);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || productConfigSubCategorySelectionAppModel != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ProductConfigSubCategorySelectionAppModel$$serializer.f8221a, productConfigSubCategorySelectionAppModel);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                if (i != -1) {
                }
                i = i4;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                    i2 = i3;
                    if (i2 != -1) {
                    }
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), value.x);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                i2 = i3;
                compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 22, i2);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), value.x);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            i = i4;
            i = i4;
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 21, i);
            i = i4;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                i2 = i3;
                if (i2 != -1) {
                }
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), value.x);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            i2 = i3;
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 22, i2);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), value.x);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        list = list2;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 18, (SerializationStrategy) lazyArr[18].getValue(), list);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 19, ProductBranding$$serializer.f5593a, value.t);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ProductConfigSubCategorySelectionAppModel$$serializer.f8221a, productConfigSubCategorySelectionAppModel);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ProductConfigSubCategorySelectionAppModel$$serializer.f8221a, productConfigSubCategorySelectionAppModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
            if (i != -1) {
            }
            i = i4;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                i2 = i3;
                if (i2 != -1) {
                }
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), value.x);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            i2 = i3;
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 22, i2);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), value.x);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        i = i4;
        i = i4;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 21, i);
        i = i4;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
            i2 = i3;
            if (i2 != -1) {
            }
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), value.x);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        i2 = i3;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 22, i2);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), value.x);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
