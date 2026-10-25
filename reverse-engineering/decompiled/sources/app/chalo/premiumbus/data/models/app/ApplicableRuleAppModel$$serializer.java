package app.chalo.premiumbus.data.models.app;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/app/ApplicableRuleAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ApplicableRuleAppModel$$serializer implements GeneratedSerializer<ApplicableRuleAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ApplicableRuleAppModel$$serializer f7071a;
    private static final SerialDescriptor descriptor;

    static {
        ApplicableRuleAppModel$$serializer applicableRuleAppModel$$serializer = new ApplicableRuleAppModel$$serializer();
        f7071a = applicableRuleAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel", applicableRuleAppModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("ruleId", false);
        pluginGeneratedSerialDescriptor.j("ruleName", false);
        pluginGeneratedSerialDescriptor.j("categoryName", false);
        pluginGeneratedSerialDescriptor.j("priceOperator", false);
        pluginGeneratedSerialDescriptor.j("priceOperatorValue", false);
        pluginGeneratedSerialDescriptor.j("uxCopy", false);
        pluginGeneratedSerialDescriptor.j("multiSeatAllowed", false);
        pluginGeneratedSerialDescriptor.j("ridesRemaining", false);
        pluginGeneratedSerialDescriptor.j("expiryAt", false);
        pluginGeneratedSerialDescriptor.j("upsellSuggestion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ApplicableRuleAppModel.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, DoubleSerializer.f18137a, lazyArr[5].getValue(), BooleanSerializer.f18123a, IntSerializer.f18146a, BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(PremiumBusPassUpsellAppModel$$serializer.f7103a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel;
        Long l;
        List list;
        boolean z;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        double d;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ApplicableRuleAppModel.k;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 4);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, null);
            list = list2;
            str = strDecodeStringElement;
            premiumBusPassUpsellAppModel = (PremiumBusPassUpsellAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, PremiumBusPassUpsellAppModel$$serializer.f7103a, null);
            i = iDecodeIntElement;
            z = zDecodeBooleanElement;
            str4 = strDecodeStringElement4;
            l = l2;
            i2 = 1023;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            d = dDecodeDoubleElement;
        } else {
            boolean z2 = true;
            int iDecodeIntElement2 = 0;
            PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel2 = null;
            Long l3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            double dDecodeDoubleElement2 = 0.0d;
            boolean zDecodeBooleanElement2 = false;
            int i4 = 0;
            List list3 = null;
            String strDecodeStringElement8 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 9;
                        break;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 9;
                        break;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 9;
                        break;
                    case 2:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 9;
                        break;
                    case 3:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list3);
                        i4 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i4 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i4 |= 128;
                        break;
                    case 8:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l3);
                        i4 |= 256;
                        break;
                    case 9:
                        premiumBusPassUpsellAppModel2 = (PremiumBusPassUpsellAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, PremiumBusPassUpsellAppModel$$serializer.f7103a, premiumBusPassUpsellAppModel2);
                        i4 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement2;
            premiumBusPassUpsellAppModel = premiumBusPassUpsellAppModel2;
            l = l3;
            list = list3;
            z = zDecodeBooleanElement2;
            i2 = i4;
            str = strDecodeStringElement8;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement7;
            d = dDecodeDoubleElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ApplicableRuleAppModel(i2, str, str2, str3, str4, d, list, z, i, l, premiumBusPassUpsellAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ApplicableRuleAppModel value = (ApplicableRuleAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ApplicableRuleAppModel.k;
        String str = value.f7070a;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = value.j;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, value.i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || premiumBusPassUpsellAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, PremiumBusPassUpsellAppModel$$serializer.f7103a, premiumBusPassUpsellAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
