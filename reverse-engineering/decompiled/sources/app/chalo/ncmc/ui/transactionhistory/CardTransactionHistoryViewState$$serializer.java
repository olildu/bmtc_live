package app.chalo.ncmc.ui.transactionhistory;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryViewState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryViewState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CardTransactionHistoryViewState$$serializer implements GeneratedSerializer<CardTransactionHistoryViewState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CardTransactionHistoryViewState$$serializer f6438a;
    private static final SerialDescriptor descriptor;

    static {
        CardTransactionHistoryViewState$$serializer cardTransactionHistoryViewState$$serializer = new CardTransactionHistoryViewState$$serializer();
        f6438a = cardTransactionHistoryViewState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState", cardTransactionHistoryViewState$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("errorMessage", true);
        pluginGeneratedSerialDescriptor.j("errorType", true);
        pluginGeneratedSerialDescriptor.j("currencySymbol", true);
        pluginGeneratedSerialDescriptor.j("showEmailStatementDialog", true);
        pluginGeneratedSerialDescriptor.j("pendingRechargeBannerTitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(CardTransactionHistoryUiErrorWrapper$$serializer.f6436a), stringSerializer, BooleanSerializer.f18123a, BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        int i;
        String str;
        CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper;
        String str2;
        String str3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper2 = (CardTransactionHistoryUiErrorWrapper) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CardTransactionHistoryUiErrorWrapper$$serializer.f6436a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            z = zDecodeBooleanElement;
            i = 31;
            str2 = strDecodeStringElement;
            cardTransactionHistoryUiErrorWrapper = cardTransactionHistoryUiErrorWrapper2;
            str = str4;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            String str5 = null;
            CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper3 = null;
            String strDecodeStringElement2 = null;
            String str6 = null;
            int i2 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str5);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    cardTransactionHistoryUiErrorWrapper3 = (CardTransactionHistoryUiErrorWrapper) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CardTransactionHistoryUiErrorWrapper$$serializer.f6436a, cardTransactionHistoryUiErrorWrapper3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str6);
                    i2 |= 16;
                }
            }
            z = zDecodeBooleanElement2;
            i = i2;
            str = str5;
            cardTransactionHistoryUiErrorWrapper = cardTransactionHistoryUiErrorWrapper3;
            str2 = strDecodeStringElement2;
            str3 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CardTransactionHistoryViewState(i, str, cardTransactionHistoryUiErrorWrapper, str2, z, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CardTransactionHistoryViewState value = (CardTransactionHistoryViewState) obj;
        Intrinsics.i(value, "value");
        String str = value.e;
        boolean z = value.d;
        String str2 = value.c;
        CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper = value.b;
        String str3 = value.f6437a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || cardTransactionHistoryUiErrorWrapper != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, CardTransactionHistoryUiErrorWrapper$$serializer.f6436a, cardTransactionHistoryUiErrorWrapper);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.d(str2, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
