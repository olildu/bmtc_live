package app.chalo.superpass.data.models.entities;

import app.chalo.models.ProductBranding;
import app.chalo.models.ProductBranding$$serializer;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/superpass/data/models/entities/SuperPassUIProperties.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/superpass/data/models/entities/SuperPassUIProperties;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassUIProperties$$serializer implements GeneratedSerializer<SuperPassUIProperties> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassUIProperties$$serializer f9579a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassUIProperties$$serializer superPassUIProperties$$serializer = new SuperPassUIProperties$$serializer();
        f9579a = superPassUIProperties$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.superpass.data.models.entities.SuperPassUIProperties", superPassUIProperties$$serializer, 11);
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
        pluginGeneratedSerialDescriptor.j("markAsUnlimited", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassUIProperties.l;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{IntSerializer.f18146a, lazyArr[1].getValue(), SuperPassUserDetails$$serializer.f9581a, lazyArr[3].getValue(), LongSerializer.f18151a, FareInfo$$serializer.f9546a, stringSerializer, stringSerializer, ProductBranding$$serializer.f5593a, stringSerializer, BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        List list;
        ProductBranding productBranding;
        Map map;
        FareInfo fareInfo;
        SuperPassUserDetails superPassUserDetails;
        int i;
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        String str3;
        long j;
        char c;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassUIProperties.l;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            SuperPassUserDetails superPassUserDetails2 = (SuperPassUserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SuperPassUserDetails$$serializer.f9581a, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            FareInfo fareInfo2 = (FareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, FareInfo$$serializer.f9546a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            ProductBranding productBranding2 = (ProductBranding) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, ProductBranding$$serializer.f5593a, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            map = map2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement;
            fareInfo = fareInfo2;
            productBranding = productBranding2;
            i = 2047;
            superPassUserDetails = superPassUserDetails2;
            list = list2;
            j = jDecodeLongElement;
        } else {
            int i6 = 3;
            boolean z = true;
            iDecodeIntElement = 0;
            ProductBranding productBranding3 = null;
            Map map3 = null;
            FareInfo fareInfo3 = null;
            List list3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement2 = false;
            SuperPassUserDetails superPassUserDetails3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i6 = 3;
                        break;
                    case 0:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i6 = 3;
                        break;
                    case 1:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list3);
                        i5 |= 2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i6 = 3;
                        break;
                    case 2:
                        superPassUserDetails3 = (SuperPassUserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SuperPassUserDetails$$serializer.f9581a, superPassUserDetails3);
                        i5 |= 4;
                        i2 = 10;
                        i3 = 9;
                        i6 = 3;
                        break;
                    case 3:
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), map3);
                        i5 |= 8;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        c = 5;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i5 |= 16;
                        i2 = 10;
                        break;
                    case 5:
                        c = 5;
                        fareInfo3 = (FareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, FareInfo$$serializer.f9546a, fareInfo3);
                        i5 |= 32;
                        i2 = 10;
                        break;
                    case 6:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 128;
                        break;
                    case 8:
                        productBranding3 = (ProductBranding) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, ProductBranding$$serializer.f5593a, productBranding3);
                        i5 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 512;
                        break;
                    case 10:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i5 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            productBranding = productBranding3;
            map = map3;
            fareInfo = fareInfo3;
            superPassUserDetails = superPassUserDetails3;
            i = i5;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            j = jDecodeLongElement2;
        }
        int i7 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassUIProperties(i, i7, list, superPassUserDetails, map, j, fareInfo, str, str2, productBranding, str3, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassUIProperties value = (SuperPassUIProperties) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassUIProperties.l;
        int i = value.f9578a;
        boolean z = value.k;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, SuperPassUserDetails$$serializer.f9581a, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, FareInfo$$serializer.f9546a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, ProductBranding$$serializer.f5593a, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
