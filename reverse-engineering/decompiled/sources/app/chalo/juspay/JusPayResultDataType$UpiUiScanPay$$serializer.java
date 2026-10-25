package app.chalo.juspay;

import androidx.core.app.FrameMetricsAggregator;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/juspay/JusPayResultDataType.UpiUiScanPay.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/juspay/JusPayResultDataType$UpiUiScanPay;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class JusPayResultDataType$UpiUiScanPay$$serializer implements GeneratedSerializer<JusPayResultDataType.UpiUiScanPay> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JusPayResultDataType$UpiUiScanPay$$serializer f4002a;
    private static final SerialDescriptor descriptor;

    static {
        JusPayResultDataType$UpiUiScanPay$$serializer jusPayResultDataType$UpiUiScanPay$$serializer = new JusPayResultDataType$UpiUiScanPay$$serializer();
        f4002a = jusPayResultDataType$UpiUiScanPay$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.juspay.JusPayResultDataType.UpiUiScanPay", jusPayResultDataType$UpiUiScanPay$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("transactionId", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j(CLConstants.LABEL_PAYEE_NAME, false);
        pluginGeneratedSerialDescriptor.j("accountRefId", false);
        pluginGeneratedSerialDescriptor.j("actionPerformed", false);
        pluginGeneratedSerialDescriptor.j("gatewayResponseCode", false);
        pluginGeneratedSerialDescriptor.j("gatewayResponseMessage", false);
        pluginGeneratedSerialDescriptor.j("transactionTimestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            i = FrameMetricsAggregator.EVERY_DURATION;
            str = strDecodeStringElement8;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement4;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement3;
            str8 = strDecodeStringElement2;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        continue;
                    case 2:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        break;
                    case 8:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement13;
            str5 = strDecodeStringElement14;
            str6 = strDecodeStringElement15;
            str7 = strDecodeStringElement16;
            str8 = strDecodeStringElement17;
        }
        String str9 = strDecodeStringElement;
        int i2 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new JusPayResultDataType.UpiUiScanPay(i2, str9, str8, str7, str4, str6, str3, str2, str, str5);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JusPayResultDataType.UpiUiScanPay value = (JusPayResultDataType.UpiUiScanPay) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
