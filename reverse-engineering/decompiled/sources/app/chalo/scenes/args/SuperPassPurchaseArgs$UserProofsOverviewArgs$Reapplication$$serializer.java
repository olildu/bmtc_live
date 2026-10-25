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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer implements GeneratedSerializer<SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer f9321a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer superPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer = new SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer();
        f9321a = superPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication", superPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("bookablePassConfig", false);
        pluginGeneratedSerialDescriptor.j("userDetailsString", false);
        pluginGeneratedSerialDescriptor.j("actionRequiredString", false);
        pluginGeneratedSerialDescriptor.j("rejectionReasonsString", false);
        pluginGeneratedSerialDescriptor.j("passStartTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.j[0].getValue(), stringSerializer, stringSerializer, stringSerializer, stringSerializer, LongSerializer.f18151a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Source source;
        long jDecodeLongElement;
        String str;
        String str2;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.j;
        int i2 = 5;
        int i3 = 0;
        Source source2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Source source3 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            source = source3;
            str = strDecodeStringElement3;
            i = 63;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str2 = strDecodeStringElement4;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
        } else {
            long jDecodeLongElement2 = 0;
            int i4 = 1;
            int i5 = 0;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 5;
                        break;
                    case 0:
                        source2 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), source2);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 5;
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
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i3 = i6;
                        break;
                    case 4:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i3 = i6;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i2);
                        i5 |= 32;
                        i3 = i6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            source = source2;
            jDecodeLongElement = jDecodeLongElement2;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement7;
            strDecodeStringElement2 = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication(i, source, str, str2, strDecodeStringElement, strDecodeStringElement2, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication value = (SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.j[0].getValue(), value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.h);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
