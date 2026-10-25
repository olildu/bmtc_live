package app.chalo.scenes.args;

import app.chalo.constants.Source;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer implements GeneratedSerializer<SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer f9312a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer superPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer = new SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer();
        f9312a = superPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification", superPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("bookablePassConfig", false);
        pluginGeneratedSerialDescriptor.j("userDetailsString", false);
        pluginGeneratedSerialDescriptor.j("passStartTime", false);
        pluginGeneratedSerialDescriptor.j("proofsMapString", false);
        pluginGeneratedSerialDescriptor.j("postPassPurchaseSuccessFlowType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), stringSerializer, stringSerializer, LongSerializer.f18151a, stringSerializer, lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Source source;
        String str;
        String str2;
        String str3;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.j;
        int i2 = 3;
        int i3 = 0;
        Source source2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Source source3 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            postPassPurchaseSuccessFlowType = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            source = source3;
            str3 = strDecodeStringElement3;
            i = 63;
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement;
            j = jDecodeLongElement;
        } else {
            int i4 = 1;
            int i5 = 0;
            String strDecodeStringElement4 = null;
            PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType2 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 3;
                        break;
                    case 0:
                        source2 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), source2);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 3;
                        break;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = i6;
                        break;
                    case 2:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = i6;
                        break;
                    case 3:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i2);
                        i5 |= 8;
                        i3 = i6;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i3 = i6;
                        break;
                    case 5:
                        postPassPurchaseSuccessFlowType2 = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), postPassPurchaseSuccessFlowType2);
                        i5 |= 32;
                        i3 = i6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            source = source2;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification(i, j, source, postPassPurchaseSuccessFlowType, str, str2, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification value = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.j;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
