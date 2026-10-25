package app.chalo.premiumbus.data.models.api.response;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/api/response/ApplicableRuleApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/ApplicableRuleApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ApplicableRuleApiResponseModel$$serializer implements GeneratedSerializer<ApplicableRuleApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ApplicableRuleApiResponseModel$$serializer f7015a;
    private static final SerialDescriptor descriptor;

    static {
        ApplicableRuleApiResponseModel$$serializer applicableRuleApiResponseModel$$serializer = new ApplicableRuleApiResponseModel$$serializer();
        f7015a = applicableRuleApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel", applicableRuleApiResponseModel$$serializer, 10);
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

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ApplicableRuleApiResponseModel.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(DoubleSerializer.f18137a), BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue()), BuiltinSerializersKt.c(BooleanSerializer.f18123a), BuiltinSerializersKt.c(IntSerializer.f18146a), BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(PremiumBusUpsellSuggestionApiResponseModel$$serializer.f7055a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PremiumBusUpsellSuggestionApiResponseModel premiumBusUpsellSuggestionApiResponseModel;
        Long l;
        List list;
        Boolean bool;
        Double d;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ApplicableRuleApiResponseModel.k;
        int i2 = 9;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Double d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DoubleSerializer.f18137a, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, null);
            list = list2;
            str = str9;
            premiumBusUpsellSuggestionApiResponseModel = (PremiumBusUpsellSuggestionApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, PremiumBusUpsellSuggestionApiResponseModel$$serializer.f7055a, null);
            num = num2;
            bool = bool2;
            d = d2;
            l = l2;
            i = 1023;
            str2 = str8;
            str4 = str7;
            str3 = str6;
        } else {
            int i3 = 5;
            boolean z = true;
            int i4 = 0;
            PremiumBusUpsellSuggestionApiResponseModel premiumBusUpsellSuggestionApiResponseModel2 = null;
            Long l3 = null;
            List list3 = null;
            Boolean bool3 = null;
            Double d3 = null;
            Integer num3 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i3 = 5;
                        break;
                    case 0:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str5);
                        i4 |= 1;
                        i2 = 9;
                        i3 = 5;
                        break;
                    case 1:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str12);
                        i4 |= 2;
                        i2 = 9;
                        i3 = 5;
                        break;
                    case 2:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str11);
                        i4 |= 4;
                        i2 = 9;
                        i3 = 5;
                        break;
                    case 3:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str10);
                        i4 |= 8;
                        i2 = 9;
                        i3 = 5;
                        break;
                    case 4:
                        d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DoubleSerializer.f18137a, d3);
                        i4 |= 16;
                        i2 = 9;
                        i3 = 5;
                        break;
                    case 5:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list3);
                        i4 |= 32;
                        i2 = 9;
                        break;
                    case 6:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, bool3);
                        i4 |= 64;
                        i2 = 9;
                        break;
                    case 7:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, num3);
                        i4 |= 128;
                        i2 = 9;
                        break;
                    case 8:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l3);
                        i4 |= 256;
                        i2 = 9;
                        break;
                    case 9:
                        premiumBusUpsellSuggestionApiResponseModel2 = (PremiumBusUpsellSuggestionApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, PremiumBusUpsellSuggestionApiResponseModel$$serializer.f7055a, premiumBusUpsellSuggestionApiResponseModel2);
                        i4 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            premiumBusUpsellSuggestionApiResponseModel = premiumBusUpsellSuggestionApiResponseModel2;
            l = l3;
            list = list3;
            bool = bool3;
            d = d3;
            num = num3;
            str = str10;
            str2 = str11;
            str3 = str5;
            str4 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ApplicableRuleApiResponseModel(i, str3, str4, str2, str, d, list, bool, num, l, premiumBusUpsellSuggestionApiResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ApplicableRuleApiResponseModel value = (ApplicableRuleApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ApplicableRuleApiResponseModel.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = value.f7014a;
        PremiumBusUpsellSuggestionApiResponseModel premiumBusUpsellSuggestionApiResponseModel = value.j;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, DoubleSerializer.f18137a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, value.i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || premiumBusUpsellSuggestionApiResponseModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, PremiumBusUpsellSuggestionApiResponseModel$$serializer.f7055a, premiumBusUpsellSuggestionApiResponseModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
