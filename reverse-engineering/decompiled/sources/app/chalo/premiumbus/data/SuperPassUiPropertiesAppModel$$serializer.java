package app.chalo.premiumbus.data;

import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/SuperPassUiPropertiesAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/SuperPassUiPropertiesAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassUiPropertiesAppModel$$serializer implements GeneratedSerializer<SuperPassUiPropertiesAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassUiPropertiesAppModel$$serializer f6974a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassUiPropertiesAppModel$$serializer superPassUiPropertiesAppModel$$serializer = new SuperPassUiPropertiesAppModel$$serializer();
        f6974a = superPassUiPropertiesAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.SuperPassUiPropertiesAppModel", superPassUiPropertiesAppModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("numOfDays", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("superPassUserDetails", false);
        pluginGeneratedSerialDescriptor.j("proofs", false);
        pluginGeneratedSerialDescriptor.j("bookingTime", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("passName", false);
        pluginGeneratedSerialDescriptor.j("categoryName", false);
        pluginGeneratedSerialDescriptor.j("productBranding", false);
        pluginGeneratedSerialDescriptor.j("fareMappingDisplayName", false);
        pluginGeneratedSerialDescriptor.j("maxPricePerTrip", true);
        pluginGeneratedSerialDescriptor.j("configId", false);
        pluginGeneratedSerialDescriptor.j("fareMappingId", false);
        pluginGeneratedSerialDescriptor.j("markAsUnlimited", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassUiPropertiesAppModel.o;
        IntSerializer intSerializer = IntSerializer.f18146a;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{intSerializer, lazyArr[1].getValue(), SuperPassUserDetailsAppModel$$serializer.f6976a, lazyArr[3].getValue(), LongSerializer.f18151a, FareInfoAppModel$$serializer.f6949a, stringSerializer, stringSerializer, ProductBrandingAppModel$$serializer.f6964a, stringSerializer, DoubleSerializer.f18137a, stringSerializer, intSerializer, BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        SuperPassUserDetailsAppModel superPassUserDetailsAppModel;
        Map map;
        List list;
        int i;
        FareInfoAppModel fareInfoAppModel;
        ProductBrandingAppModel productBrandingAppModel;
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        int iDecodeIntElement2;
        long j;
        boolean zDecodeBooleanElement;
        double d;
        char c;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassUiPropertiesAppModel.o;
        int i2 = 10;
        int i3 = 9;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            superPassUserDetailsAppModel = (SuperPassUserDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SuperPassUserDetailsAppModel$$serializer.f6976a, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            FareInfoAppModel fareInfoAppModel2 = (FareInfoAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, FareInfoAppModel$$serializer.f6949a, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            ProductBrandingAppModel productBrandingAppModel2 = (ProductBrandingAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, ProductBrandingAppModel$$serializer.f6964a, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 10);
            map = map2;
            list = list3;
            productBrandingAppModel = productBrandingAppModel2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            str = strDecodeStringElement2;
            fareInfoAppModel = fareInfoAppModel2;
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            j = jDecodeLongElement;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            i = 16383;
            d = dDecodeDoubleElement;
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            int i4 = 0;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement2 = false;
            superPassUserDetailsAppModel = null;
            FareInfoAppModel fareInfoAppModel3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            int i5 = 3;
            long jDecodeLongElement2 = 0;
            double dDecodeDoubleElement2 = 0.0d;
            Map map3 = null;
            ProductBrandingAppModel productBrandingAppModel3 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i5 = 3;
                        break;
                    case 0:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 10;
                        i3 = 9;
                        i5 = 3;
                        break;
                    case 1:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list2);
                        i4 |= 2;
                        i2 = 10;
                        i3 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        superPassUserDetailsAppModel = (SuperPassUserDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SuperPassUserDetailsAppModel$$serializer.f6976a, superPassUserDetailsAppModel);
                        i4 |= 4;
                        i2 = 10;
                        i3 = 9;
                        i5 = 3;
                        break;
                    case 3:
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), map3);
                        i4 |= 8;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        c = 5;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i4 |= 16;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        c = 5;
                        fareInfoAppModel3 = (FareInfoAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, FareInfoAppModel$$serializer.f6949a, fareInfoAppModel3);
                        i4 |= 32;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        i2 = 10;
                        break;
                    case 7:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i2 = 10;
                        break;
                    case 8:
                        productBrandingAppModel3 = (ProductBrandingAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, ProductBrandingAppModel$$serializer.f6964a, productBrandingAppModel3);
                        i4 |= 256;
                        i2 = 10;
                        break;
                    case 9:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i4 |= 512;
                        break;
                    case 10:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, i2);
                        i4 |= 1024;
                        break;
                    case 11:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i4 |= 2048;
                        break;
                    case 12:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i4 |= 4096;
                        break;
                    case 13:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i4 |= 8192;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            map = map3;
            list = list2;
            i = i4;
            fareInfoAppModel = fareInfoAppModel3;
            productBrandingAppModel = productBrandingAppModel3;
            str = strDecodeStringElement8;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement7;
            iDecodeIntElement2 = iDecodeIntElement3;
            j = jDecodeLongElement2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            d = dDecodeDoubleElement2;
        }
        int i6 = iDecodeIntElement;
        SuperPassUserDetailsAppModel superPassUserDetailsAppModel2 = superPassUserDetailsAppModel;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassUiPropertiesAppModel(i, i6, list, superPassUserDetailsAppModel2, map, j, fareInfoAppModel, str, str2, productBrandingAppModel, str3, d, strDecodeStringElement, iDecodeIntElement2, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassUiPropertiesAppModel value = (SuperPassUiPropertiesAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassUiPropertiesAppModel.o;
        int i = value.f6973a;
        double d = value.k;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, SuperPassUserDetailsAppModel$$serializer.f6976a, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, FareInfoAppModel$$serializer.f6949a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, ProductBrandingAppModel$$serializer.f6964a, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || Double.compare(d, -1.0d) != 0) {
            compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 10, d);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, value.l);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 12, value.m);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 13, value.n);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
